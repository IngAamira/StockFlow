package com.ingaamira.inventory.respnose;

import java.util.List;

import com.ingaamira.inventory.model.Product;

import lombok.Data;

@Data
public class ProductResponse {
	
	List<Product> products;

}
