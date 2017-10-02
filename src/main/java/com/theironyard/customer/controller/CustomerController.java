package com.theironyard.customer.controller;


import com.theironyard.customer.model.Customer;
import com.theironyard.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;



    @RequestMapping("/customers")
    public String customerList(Model model) {
        model.addAttribute("customers", customerService.get());
        return "customers";
    }

    @RequestMapping("/customers/{customerId}")
    public String selectedCustomer(@PathVariable int customerId, Model model) {
        Customer selectedCustomer = customerService.getById(customerId);
        model.addAttribute("customer", selectedCustomer);
        return "view_customer";
    }

    @RequestMapping("/add_customer")
    public String addCustomer(@RequestParam(value = "firstName") String firstName,
                              @RequestParam(value = "lastName") String lastName,
                              @RequestParam(value = "email") String email,
                              @RequestParam(value = "phone") String phone, Model model){

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhone(phone);

        customerService.add(customer);

        return "redirect:/customers";
    }

    @RequestMapping("/new_customer")
    public String newCustomer(Model model){
        return "new_customer";
    }

}
