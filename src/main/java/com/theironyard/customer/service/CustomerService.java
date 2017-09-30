package com.theironyard.customer.service;

import com.sun.tools.javac.util.List;
import com.theironyard.customer.model.Customer;

public interface CustomerService {

    void add(Customer customer);

    void add(List<Customer> customers);

    void update(Customer customer);

    Customer getById(int id);

    List<Customer> get();

    void delete(int id);


}
