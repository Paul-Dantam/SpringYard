package com.theironyard.customer.service;

import com.theironyard.customer.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static com.theironyard.customer.common.CustomerUtils.createTestCustomer;
import static com.theironyard.customer.common.CustomerUtils.findInList;

public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;


    @Test
    public void testAddGet(){
        Customer customer1 = createTestCustomer();
        Customer customer2 = createTestCustomer();
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        customer2.setFirstName(null);
        try {
            customerService.add((Customer) customers);
        } catch(Exception e) {
        }

        customers = customerService.get();
        Customer foundCustomer1 = findInList(customers, customer1.getFirstName(), customer1.getLastName());
        Assert.assertNull("The first customer created should have rolled back", foundCustomer1);

    }
}
