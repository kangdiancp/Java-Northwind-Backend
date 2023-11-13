package com.northwind.api.service;

import java.util.List;

import com.northwind.api.entities.Category;

public interface CategoryService extends BaseService{

    List<Category> findAllCategory();
} 
