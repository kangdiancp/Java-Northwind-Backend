package com.northwind.api.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.northwind.api.entities.Customer;
import com.northwind.api.repository.CustomerRepository;
import com.northwind.api.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    
    private final CustomerRepository repository;

    @Override
    public List<Customer> findCustomerByCountry(String country) {
        return repository.findCustomerByCountry(country);
    }

}
