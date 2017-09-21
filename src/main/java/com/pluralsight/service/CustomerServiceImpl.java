package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("We're using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll(); // hardcoded reference to out repository
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We're using setter injection");
        this.customerRepository = customerRepository;
    }
}
