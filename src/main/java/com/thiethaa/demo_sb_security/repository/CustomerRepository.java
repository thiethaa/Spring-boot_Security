package com.thiethaa.demo_sb_security.repository;

import com.thiethaa.demo_sb_security.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{
}
