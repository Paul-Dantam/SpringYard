package com.theironyard.customer.common;

import com.theironyard.customer.model.Customer;

import java.util.List;


public class CustomerUtils {

    public static Customer createTestCustomer() {
        String firstName = Long.toString(System.currentTimeMillis());
        String lastName = Long.toString(System.currentTimeMillis());

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        return customer;
    }

    public static Customer findInList(List<Customer> customers, String first, String last) {
        boolean found = false;
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(first) && customer.getLastName().equals(last)) {
                return customer;
            }
        }
        return null;
    }

}
