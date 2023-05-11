package com.hitema.projet.services;

import com.hitema.projet.entities.Customer;
import com.hitema.projet.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }
    @Override
    public List<Customer> readAll() {

        return customerRepository.findAll();
    }
}
