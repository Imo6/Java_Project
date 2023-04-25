package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.Customer;

public interface CustomerManager 
{
	void addCustomer(Customer c);
	List<Customer> getCustomers();
	void delete(int customer_Id);
	void update(Customer customer,int customer_Id);
	Optional<Customer> getCustomer(int customer_Id);
	Optional<Customer> getUsername(String user);
}