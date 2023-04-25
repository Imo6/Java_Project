package com.emart.services;


import java.util.List;
import java.util.Optional;

import com.emart.entities.Payment;

public interface PaymentManager
{
	void addPayment(Payment p);
	List<Payment> getPayments();
	void delete(int payment_Id);
	//void update(Payment Payment,int payment_Id);
	Optional<Payment> getPayment(int payment_Id);
	//List<Payment> getSelected(String cat);
}