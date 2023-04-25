package com.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Customer;
import com.emart.repository.CustomerRepository;

@Service
public class CustomerManagerImpl implements CustomerManager
{   
	@Autowired
    CustomerRepository repository;
	
	@Override
	public void addCustomer(Customer c)
	{
		repository.save(c);
	}
	
	@Override
	public List<Customer> getCustomers()
	{
		return repository.findAll();
	}
	
	@Override
	public void delete(int customer_Id)
	{
		repository.deleteById(customer_Id);
	}
	
	@Override
	public void update(Customer c,int customer_Id)
	{
		repository.update(c.getusername(),c.getpassword(),c.getprime_Customer(),c.getwallet(),c.getfirst_Name(),c.getlast_Name(),c.getemail_Id(),c.getaddress(),customer_Id);
	}
	
	@Override
	public Optional<Customer> getCustomer(int customer_Id)
	{
		return repository.findById(customer_Id);
	}
	
	@Override
	public Optional<Customer> getUsername(String user)
	{
		return repository.listUser(user);
	}
	
    
}