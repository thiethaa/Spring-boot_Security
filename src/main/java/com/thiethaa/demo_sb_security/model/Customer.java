package com.thiethaa.demo_sb_security.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {
    @Id
    private String id;
    private String name;
}
