package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// This is where your business logic will reside
public class CustomerServiceImpl implements CustomerService {

    @Autowired
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

    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We're using setter injection");
        this.customerRepository = customerRepository;
    }
}
