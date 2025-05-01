package com.ingaamira.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.ingaamira.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
