package com.theironyard.customer.service;
import org.springframework.data.jpa.repository.JpaRepository;


import com.theironyard.customer.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer add(Customer customer);
   List<Customer> add(List<Customer> customers);
    Customer update(Customer customer);

    Customer getById(int id);

    List<Customer> get();

    void delete(int id);


}
