package com.northwind.api.controller;

import java.util.List;

import javax.ws.rs.QueryParam;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.northwind.api.entities.Customer;
import com.northwind.api.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerService service;

    @GetMapping("/search")
    public ResponseEntity<?> findCustomersByCountry(@QueryParam("name") String name){
        List<Customer> customers = service.findCustomerByCountry(name);
        return new ResponseEntity<>(customers,HttpStatus.OK);
    }


}
