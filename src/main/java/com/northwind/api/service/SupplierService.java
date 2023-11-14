package com.northwind.api.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.northwind.api.entities.Supplier;

public interface SupplierService {
    List<Supplier> findAllSupplier();

    Page<Supplier> findSupplierByCityPageable(String city,int page, int size, String sort);
    
}
