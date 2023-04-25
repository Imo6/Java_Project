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

import com.emart.entities.Payment;
import com.emart.services.PaymentManager;


@RestController  
@CrossOrigin("http://localhost:3000")
public class PaymentController
{
	@Autowired
	PaymentManager manager;
	
	
	 @GetMapping(value = "api/payment")
	 public List<Payment> showPayments()
	 {
		  return manager.getPayments(); 
		
	 }
	
	 @GetMapping("api/paymentById/{payment_Id}")
	 public Optional<Payment> getPayment(@PathVariable int payment_Id)
	 {
		Optional<Payment> p=manager.getPayment(payment_Id);
		return p;
	 }

	 @DeleteMapping(value = "api/payment/{payment_Id}")
	 public void removePayment(@PathVariable int payment_Id)
	 {
		manager.delete(payment_Id);
	 }
//	 @PutMapping(value = "api/payment/{payment_Id}")
//	 public void updatePayment(@RequestBody Payment payment,@PathVariable int payment_Id)
//	 {
//		System.out.println("inside updatePayment of controller");
//		manager.update(payment,payment_Id);
//	 }
	 
	 @PostMapping("api/payment")
	 public void addPayment(@RequestBody Payment payment)
	 {
		System.out.println("addPayment called");
		manager.addPayment(payment);
	 }
}