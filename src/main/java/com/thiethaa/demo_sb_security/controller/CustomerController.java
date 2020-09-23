package com.thiethaa.demo_sb_security.controller;

import com.thiethaa.demo_sb_security.model.Customer;
import com.thiethaa.demo_sb_security.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService service;
    public CustomerController(CustomerService service) {
        this.service=service;
    }

    @GetMapping("/")
    public List<Customer> getCustomerList(){
        return service.getCustomers();
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }
}
