package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.Orders;



public interface OrdersManager {
	void addOrders(Orders order_Id);
	List<Orders> getAllOrders();
	Optional<Orders> getOrders(int order_Id);
	void delete(int order_Id);
	void update(Orders order,int order_Id);	
	List<Orders> findOrdersByCustomerId(int order_Id);

}