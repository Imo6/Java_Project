package com.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Cart;
import com.emart.repository.CartRepository;



@Service
public class CartManagerImpl implements CartManager {
	
	@Autowired
	public CartRepository repository;

	@Override
	public void addToCart(Cart cart_Id) {
		repository.save(cart_Id);
	}

	@Override
	public List<Cart> getAllCart() {
		return repository.findAll();
	}

	@Override
	public Optional<Cart> getById(int cart_Id) {
		return repository.findById(cart_Id);
	}

	@Override
	public void deleteFromCart(int cart_Id) {
		repository.deleteById(cart_Id);
	}

}