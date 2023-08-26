package com.driver.services.impl;

import com.driver.exception.CountryNotFound;
import com.driver.exception.ServiceProviderException;
import com.driver.exception.UserException;
import com.driver.model.Country;
import com.driver.model.CountryName;
import com.driver.model.ServiceProvider;
import com.driver.model.User;
import com.driver.repository.CountryRepository;
import com.driver.repository.ServiceProviderRepository;
import com.driver.repository.UserRepository;
import com.driver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository3;
    @Autowired
    ServiceProviderRepository serviceProviderRepository3;
    @Autowired
    CountryRepository countryRepository3;

    @Override
    public User register(String username, String password, String countryName) throws Exception{
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

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

        Country country = new Country();
        country.setCountryName(countryName1);
        country.setCode(countryName1.toCode());
        country.setUser(user);

        Country savedCountry = countryRepository3.save(country);
        user.setCountry(savedCountry);

        User savedUser = userRepository3.save(user);

        savedUser.setOriginalIp(countryName1.toCode()+"."+savedUser.getId());

        return userRepository3.save(savedUser);

    }

    @Override
    public User subscribe(Integer userId, Integer serviceProviderId) {
        Optional<User> optionalUser = userRepository3.findById(userId);

//        if(!optionalUser.isPresent()){
//            throw new UserException("User not found.");
//        }
        User user = optionalUser.get();

        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepository3.findById(serviceProviderId);

//        if(!optionalServiceProvider.isPresent()){
//            throw new ServiceProviderException("Service provider not found.");
//        }
        ServiceProvider serviceProvider = optionalServiceProvider.get();

        user.getServiceProviderList().add(serviceProvider);
        serviceProvider.getUsers().add(user);

        serviceProviderRepository3.save(serviceProvider);

        return userRepository3.save(user);
    }
}
