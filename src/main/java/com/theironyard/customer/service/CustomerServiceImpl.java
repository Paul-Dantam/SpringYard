package com.theironyard.customer.service;

import java.util.List;
import com.theironyard.customer.model.Customer;
import com.theironyard.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
    public void add(List<Customer> customers) {
        for (Customer customer : customers) {
            customerRepository.add(customer);
        }
    }


    @Transactional
    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);

    }

    @Override
    public Customer getById(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public List<Customer> get() {
        return customerRepository.get();
    }


    @Transactional
    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

}
