package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collections;
import java.util.List;
public interface CustomerRepository
        extends JpaRepository<Customer,Long> { }
