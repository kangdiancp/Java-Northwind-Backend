package com.northwind.api.controller;


import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.northwind.api.dto.CategoryDto;
import com.northwind.api.entities.Category;
import com.northwind.api.mapper.CategoryMapper;
import com.northwind.api.service.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final Logger logger = LoggerFactory.getLogger(CategoryController.class);
    private final CategoryService service;
    private final CategoryMapper mapper;

    @GetMapping
    public ResponseEntity<?> getAll(){
        logger.debug("Resource:: request to get all categories");
        
        // mapping from entity category to dto
        List<CategoryDto> categoriesDto = mapper.map(service.findAllCategory());

        return new ResponseEntity<>(categoriesDto,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createEntity(@Valid @RequestBody CategoryDto categoryDto){
        logger.debug("Resource:: request to get all categories");
        //mapping from dto to entity
        Category categoryEntity = mapper.map(categoryDto);

        categoryEntity  = service.createEntity(categoryEntity).get();

        //CategoryDto dto = mapper.map(category); 
        categoryDto = mapper.map(categoryEntity);

        return new ResponseEntity<>(categoryDto,HttpStatus.CREATED);
    }

     @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findCategoryById(@PathVariable("id") Long id) {
        logger.debug("RESOURCE::REQUEST TO GET CATEGORY BY ID{}", id);
        CategoryDto toDto = service.findEntityById(id);
        return new ResponseEntity<>(toDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> detelCategoryById(@PathVariable("id") Long id) {
        logger.debug("RESOURCE::DELETE CATEGORY BY ID{}", id);
        //service.deleteEntity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
