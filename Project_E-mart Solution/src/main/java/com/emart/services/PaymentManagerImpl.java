package com.emart.services;
import java.util.List;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Payment;
import com.emart.repository.PaymentRepository;

@Service
public class PaymentManagerImpl implements PaymentManager
{
	@Autowired
	PaymentRepository repository;

	@Override
	public void addPayment(Payment p) {
		repository.save(p);
		
		
	}

	@Override
	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int payment_Id) {
		repository.deleteById(payment_Id);
	}

//	@Override
//	public void update(Product product,int id) {
//		// TODO Auto-generated method stub
//		System.out.println("inside update method of service layer");
//		repository.update(product.getProname(),product.getCategory(),product.getPrice(),product.getQuantity(),id);
//	}

	@Override
	public Optional<Payment> getPayment(int payment_Id) {
		// TODO Auto-generated method stub
		return repository.findById(payment_Id);
	}

//	@Override
//	public List<Product> getSelected(String cat) {
//		// TODO Auto-generated method stub
//		return repository.listCat(cat);
//	}
	
	

}
