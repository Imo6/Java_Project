package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.Category;
import com.emart.entities.ProductDetails;

public interface ProductDetailsManager
{
	void addProductDetails(ProductDetails c);
	List<ProductDetails> getProductDetails();
	void delete(int id);
	
	Optional<ProductDetails> getProductDetail(int id);
	
	List<ProductDetails> getDetails(int product);
	
}
