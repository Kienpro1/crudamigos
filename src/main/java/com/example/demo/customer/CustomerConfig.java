package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Value("${app.userFakeCustomerRepo:false}")
    private Boolean userFakeCustomerRepo;
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Command line runner hooray");
        };
    }
    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFakeCustomerRepo="+userFakeCustomerRepo);
               return new CustomerFakeRepository();
    }
}
