package com.ingaamira.inventory.services;

import org.springframework.http.ResponseEntity;

import com.ingaamira.inventory.model.Category;
import com.ingaamira.inventory.respnose.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);
	public ResponseEntity<CategoryResponseRest> deleteById(Long id);

}
