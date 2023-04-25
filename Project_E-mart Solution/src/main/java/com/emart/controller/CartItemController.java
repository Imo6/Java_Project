package com.emart.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.entities.CartItem;
import com.emart.services.CartItemManager;


@RestController  
@CrossOrigin("http://localhost:3000")
public class CartItemController
{
	@Autowired
	CartItemManager manager;
	
	
	 @GetMapping(value = "api/cartitems")
	 public List<CartItem> showcartitems()
	 {
		  return manager.getCartItems(); 
		
	 }
	
	 @GetMapping(value = "api/cartitemsById/{ctid}")
	 public Optional<CartItem> getcartitem(@PathVariable int ctid)
	 {
		Optional<CartItem> p=manager.getCartItem(ctid);
		return p;
	 }
	
	 @DeleteMapping(value = "api/cartitems/{ctid}")
	 public void removecartitem(@PathVariable int ctid)
	 {
		manager.delete(ctid);
	 }
	 @PutMapping(value = "api/cartitems/{ctid}")
	 public void updatecartitem(@RequestBody CartItem cartitem,@PathVariable int ctid)
	 {
		manager.update(cartitem,ctid);
	 }
	 @PostMapping(value = "api/cartitems")
	 public void addcartitem(@RequestBody CartItem cartitem)
	 {
		manager.addCartItem(cartitem);
	 }
}