package com.northwind.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.northwind.api.dto.CategoryDto;
import com.northwind.api.entities.Category;

@Mapper(componentModel="spring")
public interface CategoryMapper {
    //@Mapping(target = "desc", source = "category.description")

    //entity to dto
    CategoryDto map(Category category);
    
    // dto to entity
    Category map(CategoryDto categoryDto);

    //list category entity to list categorydto
    List<CategoryDto> map(List<Category> category);
}
