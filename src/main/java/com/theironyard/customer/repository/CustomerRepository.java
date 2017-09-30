package com.theironyard.customer.repository;

import com.theironyard.customer.model.Customer;

import java.util.List;

public interface CustomerRepository {

    void add(Customer customer);

    void update(Customer customer);

    Customer getById(int id);

    List<Customer> get();

    void delete(int id);

}
