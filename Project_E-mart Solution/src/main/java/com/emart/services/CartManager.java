package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.Cart;



public interface CartManager {
	
	void addToCart(Cart cart_Id);
	List<Cart> getAllCart();
	Optional<Cart> getById(int cart_Id);
	void deleteFromCart(int cart_Id);

}