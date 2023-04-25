package com.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Category;
import com.emart.entities.Product;
import com.emart.repository.CategoryRepository;
import com.emart.repository.ProductRepository;

@Service
public class ProductManagerImpl implements ProductManager
{
	@Autowired
	ProductRepository repository;

	@Override
	public void addProduct(Product p) {
		System.out.println("product is "+p);
		repository.save(p);
		
		
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	
	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	@Override
	public List<Product> getProductByCat(int cat_Id)
	{
		return repository.getProducts(cat_Id);
	}


}
