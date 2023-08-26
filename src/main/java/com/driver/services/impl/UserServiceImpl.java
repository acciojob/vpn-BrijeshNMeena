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
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   // @Autowired
    UserRepository userRepository3 = new UserRepository() {
       @Override
       public List<User> findAll() {
           return null;
       }

       @Override
       public List<User> findAll(Sort sort) {
           return null;
       }

       @Override
       public List<User> findAllById(Iterable<Integer> iterable) {
           return null;
       }

       @Override
       public <S extends User> List<S> saveAll(Iterable<S> iterable) {
           return null;
       }

       @Override
       public void flush() {

       }

       @Override
       public <S extends User> S saveAndFlush(S s) {
           return null;
       }

       @Override
       public void deleteInBatch(Iterable<User> iterable) {

       }

       @Override
       public void deleteAllInBatch() {

       }

       @Override
       public User getOne(Integer integer) {
           return null;
       }

       @Override
       public <S extends User> List<S> findAll(Example<S> example) {
           return null;
       }

       @Override
       public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
           return null;
       }

       @Override
       public Page<User> findAll(Pageable pageable) {
           return null;
       }

       @Override
       public <S extends User> S save(S s) {
           return null;
       }

       @Override
       public Optional<User> findById(Integer integer) {
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
       public void delete(User user) {

       }

       @Override
       public void deleteAll(Iterable<? extends User> iterable) {

       }

       @Override
       public void deleteAll() {

       }

       @Override
       public <S extends User> Optional<S> findOne(Example<S> example) {
           return Optional.empty();
       }

       @Override
       public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
           return null;
       }

       @Override
       public <S extends User> long count(Example<S> example) {
           return 0;
       }

       @Override
       public <S extends User> boolean exists(Example<S> example) {
           return false;
       }
   };
  //  @Autowired
    ServiceProviderRepository serviceProviderRepository3 = new ServiceProviderRepository() {
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
    CountryRepository countryRepository3 = new CountryRepository() {
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
