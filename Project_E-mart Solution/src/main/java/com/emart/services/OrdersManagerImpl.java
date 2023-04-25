package com.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Orders;
import com.emart.repository.OrdersRepository;



@Service
public class OrdersManagerImpl implements OrdersManager {
	
	@Autowired
	public OrdersRepository repository;

	@Override
	public void addOrders(Orders order_Id) {
		repository.save(order_Id);
		
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Orders> getOrders(int order_Id) {
		// TODO Auto-generated method stub
		return repository.findById(order_Id);
	}

	@Override
	public void delete(int order_Id) {
		repository.deleteById(order_Id);
		
	}
	
	@Override
	public void update(Orders order,int order_Id) {
		repository.update(order.getOrder_Date(),order.getOrder_Total(),order_Id);
		
	}
	
}