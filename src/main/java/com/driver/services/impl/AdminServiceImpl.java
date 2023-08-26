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
 //   @Autowired
    AdminRepository adminRepository1 = new AdminRepository() {
     @Override
     public List<Admin> findAll() {
         return null;
     }

     @Override
     public List<Admin> findAll(Sort sort) {
         return null;
     }

     @Override
     public List<Admin> findAllById(Iterable<Integer> iterable) {
         return null;
     }

     @Override
     public <S extends Admin> List<S> saveAll(Iterable<S> iterable) {
         return null;
     }

     @Override
     public void flush() {

     }

     @Override
     public <S extends Admin> S saveAndFlush(S s) {
         return null;
     }

     @Override
     public void deleteInBatch(Iterable<Admin> iterable) {

     }

     @Override
     public void deleteAllInBatch() {

     }

     @Override
     public Admin getOne(Integer integer) {
         return null;
     }

     @Override
     public <S extends Admin> List<S> findAll(Example<S> example) {
         return null;
     }

     @Override
     public <S extends Admin> List<S> findAll(Example<S> example, Sort sort) {
         return null;
     }

     @Override
     public Page<Admin> findAll(Pageable pageable) {
         return null;
     }

     @Override
     public <S extends Admin> S save(S s) {
         return null;
     }

     @Override
     public Optional<Admin> findById(Integer integer) {
         return Optional.empty();
     }

     @Override
     public boolean existsById(Integer integer) {
         return false;
     }

     @Override
     public long count() {
         return 0;
     }

     @Override
     public void deleteById(Integer integer) {

     }

     @Override
     public void delete(Admin admin) {

     }

     @Override
     public void deleteAll(Iterable<? extends Admin> iterable) {

     }

     @Override
     public void deleteAll() {

     }

     @Override
     public <S extends Admin> Optional<S> findOne(Example<S> example) {
         return Optional.empty();
     }

     @Override
     public <S extends Admin> Page<S> findAll(Example<S> example, Pageable pageable) {
         return null;
     }

     @Override
     public <S extends Admin> long count(Example<S> example) {
         return 0;
     }

     @Override
     public <S extends Admin> boolean exists(Example<S> example) {
         return false;
     }
 };

   // @Autowired
    ServiceProviderRepository serviceProviderRepository1 = new ServiceProviderRepository() {
       @Override
       public List<ServiceProvider> findAll() {
           return null;
       }

       @Override
       public List<ServiceProvider> findAll(Sort sort) {
           return null;
       }

       @Override
       public List<ServiceProvider> findAllById(Iterable<Integer> iterable) {
           return null;
       }

       @Override
       public <S extends ServiceProvider> List<S> saveAll(Iterable<S> iterable) {
           return null;
       }

       @Override
       public void flush() {

       }

       @Override
       public <S extends ServiceProvider> S saveAndFlush(S s) {
           return null;
       }

       @Override
       public void deleteInBatch(Iterable<ServiceProvider> iterable) {

       }

       @Override
       public void deleteAllInBatch() {

       }

       @Override
       public ServiceProvider getOne(Integer integer) {
           return null;
       }

       @Override
       public <S extends ServiceProvider> List<S> findAll(Example<S> example) {
           return null;
       }

       @Override
       public <S extends ServiceProvider> List<S> findAll(Example<S> example, Sort sort) {
           return null;
       }

       @Override
       public Page<ServiceProvider> findAll(Pageable pageable) {
           return null;
       }

       @Override
       public <S extends ServiceProvider> S save(S s) {
           return null;
       }

       @Override
       public Optional<ServiceProvider> findById(Integer integer) {
           return Optional.empty();
       }

       @Override
       public boolean existsById(Integer integer) {
           return false;
       }

       @Override
       public long count() {
           return 0;
       }

       @Override
       public void deleteById(Integer integer) {

       }

       @Override
       public void delete(ServiceProvider serviceProvider) {

       }

       @Override
       public void deleteAll(Iterable<? extends ServiceProvider> iterable) {

       }

       @Override
       public void deleteAll() {

       }

       @Override
       public <S extends ServiceProvider> Optional<S> findOne(Example<S> example) {
           return Optional.empty();
       }

       @Override
       public <S extends ServiceProvider> Page<S> findAll(Example<S> example, Pageable pageable) {
           return null;
       }

       @Override
       public <S extends ServiceProvider> long count(Example<S> example) {
           return 0;
       }

       @Override
       public <S extends ServiceProvider> boolean exists(Example<S> example) {
           return false;
       }
   };

   // @Autowired
    CountryRepository countryRepository1 = new CountryRepository() {
       @Override
       public List<Country> findAll() {
           return null;
       }

       @Override
       public List<Country> findAll(Sort sort) {
           return null;
       }

       @Override
       public List<Country> findAllById(Iterable<Integer> iterable) {
           return null;
       }

       @Override
       public <S extends Country> List<S> saveAll(Iterable<S> iterable) {
           return null;
       }

       @Override
       public void flush() {

       }

       @Override
       public <S extends Country> S saveAndFlush(S s) {
           return null;
       }

       @Override
       public void deleteInBatch(Iterable<Country> iterable) {

       }

       @Override
       public void deleteAllInBatch() {

       }

       @Override
       public Country getOne(Integer integer) {
           return null;
       }

       @Override
       public <S extends Country> List<S> findAll(Example<S> example) {
           return null;
       }

       @Override
       public <S extends Country> List<S> findAll(Example<S> example, Sort sort) {
           return null;
       }

       @Override
       public Page<Country> findAll(Pageable pageable) {
           return null;
       }

       @Override
       public <S extends Country> S save(S s) {
           return null;
       }

       @Override
       public Optional<Country> findById(Integer integer) {
           return Optional.empty();
       }

       @Override
       public boolean existsById(Integer integer) {
           return false;
       }

       @Override
       public long count() {
           return 0;
       }

       @Override
       public void deleteById(Integer integer) {

       }

       @Override
       public void delete(Country country) {

       }

       @Override
       public void deleteAll(Iterable<? extends Country> iterable) {

       }

       @Override
       public void deleteAll() {

       }

       @Override
       public <S extends Country> Optional<S> findOne(Example<S> example) {
           return Optional.empty();
       }

       @Override
       public <S extends Country> Page<S> findAll(Example<S> example, Pageable pageable) {
           return null;
       }

       @Override
       public <S extends Country> long count(Example<S> example) {
           return 0;
       }

       @Override
       public <S extends Country> boolean exists(Example<S> example) {
           return false;
       }
   };

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
