package com.theironyard.customer.service;


import com.theironyard.customer.model.Customer;

import java.util.List;


public interface CustomerService {

    void add(Customer customer);
    void add(List<Customer> customers);
    // Update a customer
    void update(Customer customer);
    // get customer by id
    Customer getById(int id);
    // Get all customers
    List<Customer> get();
    // Delete a customer
    void delete(int id);
}
