package com.northwind.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="categories",schema="dbo")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categoryid",updatable = false, nullable = false)
    private Long categoryId;
    
    @Column(name="categoryname")
    private String categoryName;

    @Column(name="description")
    private String description;

    //@NoArgsConstructor
    //public Category()

    //@AllArgsConstructor
    //public Category(Integer categoryId,String categoryName, String description)

}
