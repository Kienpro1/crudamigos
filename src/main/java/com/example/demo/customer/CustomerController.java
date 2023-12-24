package com.example.demo.customer;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
@Deprecated
@RequestMapping(path ="api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService){

    this.customerService=customerService;
    }
    @GetMapping(value = "all")
    List<Customer> getCustomer(){
        return customerService.getCustomer();
    }
    @PostMapping
    void createnewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }
    @PutMapping
    void putCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }
    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID=" +id);
    }
}
