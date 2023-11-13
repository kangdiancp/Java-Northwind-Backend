package com.northwind.api.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.northwind.api.entities.Category;
import com.northwind.api.repository.CategoryRepository;
import com.northwind.api.service.CategoryService;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository repository;

    @Override
    public List<Category> findAllCategory() {
        return repository.findAll();
    }

    @Override
    public <T> Optional<T> createEntity(T entity) {
        Category category = (Category) entity;
        repository.save(category);
        return (Optional<T>) Optional.of(category);
    }

    @Override
    public <T> List<T> findAllEntity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllEntity'");
    }

    @Override
    public <T> T findEntityById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEntityById'");
    }

    @Override
    public void deleteEntityById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEntityById'");
    }

}
