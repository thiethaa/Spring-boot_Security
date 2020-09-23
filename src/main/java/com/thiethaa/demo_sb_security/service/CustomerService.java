package com.thiethaa.demo_sb_security.service;

import com.thiethaa.demo_sb_security.model.Customer;
import com.thiethaa.demo_sb_security.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer>getCustomers(){
        return repository.findAll();
    }
    public Customer addCustomer(Customer customer){
        Customer c = new Customer();
        c.setId(customer.getId());
        c.setName(customer.getName());
        return repository.save(c);
    }
}
