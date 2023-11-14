package com.northwind.api.entities;


import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="suppliers",schema="dbo")
public class Supplier {
    @Id
    @Column(name="supplierid",updatable = false, nullable = false)
    private Long supplierId;

    @Column(name="companyname")
    private String companyName;

    @Column(name="city")
    private String city;

    @OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY)
    private List<Product> products;
}
