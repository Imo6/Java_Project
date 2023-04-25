package com.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.entities.Cart;
import com.emart.services.CartManager;



@RestController
@CrossOrigin("http://localhost:3000")
public class CartController {
	
	@Autowired
	private CartManager manager;
	
	@PostMapping("api/add")
	public void addTo(@RequestBody Cart cart){
		manager.addToCart(cart);
	}
	
	@GetMapping("api/get")
	public List<Cart> getAll(){
		return manager.getAllCart();
	}
	
	@GetMapping("api/get/{cart_Id}")
	public Optional<Cart> getBy(@PathVariable int cart_Id){
		return manager.getById(cart_Id); 
	}
	
	@DeleteMapping("api/delete/{cart_Id}")
	public void deleteFrom(@PathVariable int cart_Id){
		manager.deleteFromCart(cart_Id);
	}
}