package com.theironyard.customer.service;

import com.theironyard.customer.model.Customer;
import com.theironyard.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Transactional
    @Override
    public Customer add(Customer customer) {
      return  customerRepository.save(customer);

    }

    @Transactional
    @Override
    public List<Customer> add(List<Customer> customers) {
        for (Customer customer : customers) {
             customerRepository.save(customers);
        }
        return customers;
    }


    @Transactional
    @Override
    public Customer update(Customer customer) {
       return customerRepository.save(customer);

    }

    @Override
    public Customer getById(int id) {
        return customerRepository.findOne(id);
    }

    @Override
    public List<Customer> get() {
        return customerRepository.findAll();
    }


    @Transactional
    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

}
