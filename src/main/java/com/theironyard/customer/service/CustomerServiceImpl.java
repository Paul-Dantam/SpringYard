package com.theironyard.customer.service;

import com.sun.tools.javac.util.List;
import com.theironyard.customer.model.Customer;
import com.theironyard.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Transactional
    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);

    }

    @Transactional
    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);

    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public List<Customer> get() {
        return null;
    }


    @Transactional
    @Override
    public void delete(int id) {

    }

}
