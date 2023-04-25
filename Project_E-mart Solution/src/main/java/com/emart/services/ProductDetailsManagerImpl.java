package com.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Category;
import com.emart.entities.Configuration;
import com.emart.entities.ProductDetails;
import com.emart.repository.ConfigurationRepository;
import com.emart.repository.ProductDetailsRepository;

@Service
public class ProductDetailsManagerImpl implements ProductDetailsManager
{
	@Autowired
	ProductDetailsRepository repository;
	
	@Override
	public void  addProductDetails(ProductDetails c)
	{
		repository.save(c);
		
		
	}
	@Override
	public List<ProductDetails> getProductDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}
	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	@Override
	public Optional<ProductDetails> getProductDetail(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
	@Override
	public List<ProductDetails> getDetails(int p_Id)
	{
		return repository.getDetails(p_Id);
	}
}