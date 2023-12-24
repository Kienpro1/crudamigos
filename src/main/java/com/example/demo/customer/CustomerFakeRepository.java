package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
@Repository(value = "fake")
public class CustomerFakeRepository
implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        return Collections.singletonList(
                new Customer(1L,"kiên","123", "email@gmail.com")
        );
    }
}
