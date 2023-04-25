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

import com.emart.entities.Orders;
import com.emart.services.OrdersManager;



@RestController
@CrossOrigin("http://localhost:3000")
public class OrdersController {
	
	@Autowired
	public OrdersManager manager;
	
	@PostMapping("api/addorders")
	public void addOrd(@RequestBody Orders orders){ 
		manager.addOrders(orders);
	}
	
	@GetMapping("api/orders")
	public List<Orders> getAllOrd(){
		return manager.getAllOrders();
	}
	
	@GetMapping("api/orders/{order_Id}")
	public Optional<Orders> getOrd(@PathVariable int order_Id){
		return manager.getOrders(order_Id);
		
	}
	
	@DeleteMapping("api/delete/{order_Id}")
	public void del(@PathVariable int order_Id){
		manager.delete(order_Id);
	}
	@PutMapping("api/updateOrder/{order_Id}")
	public void updateOrder(@RequestBody Orders order,@PathVariable int order_Id)
	{
		manager.update(order, order_Id);
	}
}