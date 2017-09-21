package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository") // defined as customerRepository bean
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Marit");
        customer.setLastName("van Dijk");

        customers.add(customer);

        return customers;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }
}
