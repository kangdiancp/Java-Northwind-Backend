package com.northwind.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.northwind.api.entities.Supplier;

@Repository
@RepositoryRestResource(path="suppliers")
public interface SupplierRepository extends JpaRepository<Supplier,Long>{
    
    public Page<Supplier> findByCityContainingIgnoreCase(String city,Pageable pageable);
}
