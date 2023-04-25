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

import com.emart.entities.Customer;
import com.emart.services.CustomerManager;

@RestController  
@CrossOrigin("http://localhost:3000")
public class CustomerController 
{
	@Autowired
	CustomerManager manager;
	
	
	 @GetMapping(value = "api/customers")
	 public List<Customer> showCustomers()
	 {
		  return manager.getCustomers(); 
		
	 }
	
	 @GetMapping(value = "api/customerById/{customer_Id}")
	 public Optional<Customer> getCustomer(@PathVariable int customer_Id)
	 {
		Optional<Customer> c=manager.getCustomer(customer_Id);
		return c;
	 }
	
	 @DeleteMapping(value = "api/customer/{customer_Id}")
	 public void removeCustomer(@PathVariable int customer_Id)
	 {
		manager.delete(customer_Id);
	 }
	 @PutMapping(value = "api/customer/{customer_Id}")
	 public void updateCustomer(@RequestBody Customer customer,@PathVariable int customer_Id)
	 {
		System.out.println("inside updateCustomer of controller");
		manager.update(customer,customer_Id);
	 }
	 @PostMapping(value = "api/customer")
	 public void addCustomer(@RequestBody Customer customer)
	 {
		System.out.println("addCustomer called");
		manager.addCustomer(customer);
	 }
	 @GetMapping(value="api/customer/{user}")
	 public Optional<Customer> getUsername(@PathVariable String user)
	 {
		Optional<Customer> c=manager.getUsername(user);
		return c;
	 }
}