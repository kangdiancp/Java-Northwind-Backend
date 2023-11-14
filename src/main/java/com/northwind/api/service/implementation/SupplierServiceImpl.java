package com.northwind.api.service.implementation;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.northwind.api.entities.Supplier;
import com.northwind.api.repository.SupplierRepository;
import com.northwind.api.service.SupplierService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService{
    
    private final SupplierRepository repository;

    @Override
    public List<Supplier> findAllSupplier() {
        return repository.findAll();    
    }

    @Override
    public Page<Supplier> findSupplierByCityPageable(String city,int page, int size, String sort) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
        return repository.findByCityContainingIgnoreCase(city,pageable);
    }
    
}
