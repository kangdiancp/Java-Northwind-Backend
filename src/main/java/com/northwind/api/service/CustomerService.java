package com.northwind.api.service;

import java.util.List;

import com.northwind.api.entities.Customer;

public interface CustomerService {
    public List<Customer> findCustomerByCountry(String country);
}
