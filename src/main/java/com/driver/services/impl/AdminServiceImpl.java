package com.driver.services.impl;

import com.driver.exception.AdminNotFound;
import com.driver.exception.CountryNotFound;
import com.driver.exception.ServiceProviderException;
import com.driver.model.Admin;
import com.driver.model.Country;
import com.driver.model.CountryName;
import com.driver.model.ServiceProvider;
import com.driver.repository.AdminRepository;
import com.driver.repository.CountryRepository;
import com.driver.repository.ServiceProviderRepository;
import com.driver.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository1;

    @Autowired
    ServiceProviderRepository serviceProviderRepository1;

    @Autowired
    CountryRepository countryRepository1;

    @Override
    public Admin register(String username, String password) {
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        return adminRepository1.save(admin);
    }

    @Override
    public Admin addServiceProvider(int adminId, String providerName) {
        Optional<Admin> optionalAdmin = adminRepository1.findById(adminId);
        if(!optionalAdmin.isPresent()) {
            throw new AdminNotFound("Invalid admin.");
        }

        Admin admin = optionalAdmin.get();

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setName(providerName);
        serviceProvider.setAdmin(admin);

        ServiceProvider savedServiceProvider = serviceProviderRepository1.save(serviceProvider);

        admin.getServiceProviders().add(savedServiceProvider);

        return adminRepository1.save(admin);
    }

    @Override
    public ServiceProvider addCountry(int serviceProviderId, String countryName) throws Exception{

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

        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepository1.findById(serviceProviderId);
        if(!optionalServiceProvider.isPresent()){
            throw new ServiceProviderException("Invalid Service provider");
        }

        ServiceProvider serviceProvider = optionalServiceProvider.get();
        country.setServiceProvider(serviceProvider);
        Country savedCountry = countryRepository1.save(country);

        serviceProvider.getCountryList().add(savedCountry);

        return serviceProviderRepository1.save(serviceProvider);

    }
}
