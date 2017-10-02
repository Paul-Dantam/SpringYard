package com.theironyard.customer.model;

import javax.persistence.*;

@Entity
@Table
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;


    public Customer() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        return getId() == customer.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
