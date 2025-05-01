package com.ingaamira.inventory.respnose;

import java.util.List;

import com.ingaamira.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
