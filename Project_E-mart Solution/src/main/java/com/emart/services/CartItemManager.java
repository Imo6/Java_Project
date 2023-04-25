package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.CartItem;

public interface CartItemManager {

	void addCartItem(CartItem p);
	List<CartItem> getCartItems();
	void delete(int id);
	void update(CartItem cartitem,int id);
	Optional<CartItem> getCartItem(int id);

}

