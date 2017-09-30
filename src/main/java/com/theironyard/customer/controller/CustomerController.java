package com.theironyard.customer.controller;


import com.theironyard.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @RequestMapping("/customers")
    public String customerList(Model model) {
        model.addAttribute("customers", customerService.get());
        return "customers";
    }

}
