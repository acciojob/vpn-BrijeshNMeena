package com.driver.services.impl;

import com.driver.exception.ConnectionException;
import com.driver.exception.CountryNotFound;
import com.driver.exception.UserException;
import com.driver.model.*;
import com.driver.repository.ConnectionRepository;
import com.driver.repository.ServiceProviderRepository;
import com.driver.repository.UserRepository;
import com.driver.services.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

@Service
public class ConnectionServiceImpl implements ConnectionService {
   @Autowired
    UserRepository userRepository2;
    @Autowired
    ServiceProviderRepository serviceProviderRepository2;
    @Autowired
    ConnectionRepository connectionRepository2;

    @Override
    public User connect(int userId, String countryName) throws Exception{
        Optional<User> optionalUser = userRepository2.findById(userId);
//        if(!optionalUser.isPresent()){
//            throw new UserException("User not found");
//        }
        User user = optionalUser.get();

        if(user.getConnected()) {
            throw new ConnectionException("Already connected");
        }

        CountryName countryName1;

        if(countryName.toUpperCase().equals("IND"))
            countryName1 = CountryName.IND;
        else if (countryName.toUpperCase().equals("AUS"))
            countryName1 = CountryName.AUS;
        else if (countryName.toUpperCase().equals("USA"))
            countryName1 = CountryName.USA;
        else if (countryName.toUpperCase().equals("CHI"))
            countryName1 = CountryName.CHI;
        else if (countryName.toUpperCase().equals("JPN"))
            countryName1 = CountryName.JPN;
        else
            throw new CountryNotFound("Country not found");

        if(user.getOriginalCountry().getCode().equals(countryName1.toCode())) {
            return user;
        }

        boolean countryFound = false;
        Country country = null;
        TreeSet<Integer> set = new TreeSet<>();
        List<ServiceProvider> providerList = user.getServiceProviderList();
        for(ServiceProvider sp : providerList) {
            List<Country> list = sp.getCountryList();
            for(Country c : list) {
                if(c.getCode().equals(countryName1.toCode())) {
                    country = c;
                    set.add(sp.getId());
                    countryFound = true;
                }
            }
        }
        if(!countryFound){
            throw new ConnectionException("Unable to connect");
        }

        Connection connection = new Connection();
        connection.setUser(user);
        ServiceProvider serviceProvider = serviceProviderRepository2.findById(set.first()).get();
        connection.setServiceProvider(serviceProvider);

        connectionRepository2.save(connection);
        user.setMaskedIp(country.getCode()+"."+serviceProvider.getId()+"."+userId);
        user.setConnected(true);
        user.getServiceProviderList().add(serviceProvider);
        user.getConnectionList().add(connection);
        //user.setCountry(country);
        serviceProvider.getUsers().add(user);
        serviceProvider.getConnectionList().add(connection);

        serviceProviderRepository2.save(serviceProvider);

        return userRepository2.save(user);

    }
    @Override
    public User disconnect(int userId) throws Exception {
        Optional<User> optionalUser = userRepository2.findById(userId);
//        }
        User user = optionalUser.get();

        if(!user.getConnected()) {
            throw new ConnectionException("Already disconnected");
        }

        user.setConnected(false);
        user.setMaskedIp(null);

        return userRepository2.save(user);
    }
    @Override
    public User communicate(int senderId, int receiverId) throws Exception {
        Optional<User> optionalUser = userRepository2.findById(receiverId);
//        if(!optionalUser.isPresent()){
//            throw new UserException("Receiver not found");
//        }
        User receiver = optionalUser.get();

        Optional<User> optionalUser1 = userRepository2.findById(senderId);
//        if(!optionalUser1.isPresent()){
//            throw new UserException("Sender not found");
//        }
        User sender = optionalUser1.get();

        String country = null;
        String code = receiver.getOriginalCountry().getCode();
        if(receiver.getConnected()) {
            String maskedIp = receiver.getMaskedIp();
            code = maskedIp.substring(0, maskedIp.indexOf("."));
            if(CountryName.IND.toCode().equals(code))
                country = "IND";
            else if (CountryName.AUS.toCode().equals(code))
                country = "AUS";
            else if (CountryName.USA.toCode().equals(code))
                country = "USA";
            else if (CountryName.CHI.toCode().equals(code))
                country = "CHI";
            else if (CountryName.JPN.toCode().equals(code))
                country = "JPN";
        }

        if(sender.getOriginalCountry().getCode().equals(code)) {
            return sender;
        }

        return connect(senderId, country);
    }
}
