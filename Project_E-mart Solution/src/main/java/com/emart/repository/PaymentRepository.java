package com.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emart.entities.Payment;

@Repository
@Transactional 
public interface PaymentRepository extends JpaRepository<Payment,Integer> 
{
	
//	@Modifying
//	@Query("update Payment p set p.payment_Type = :payment_Type, p.amount = :amount,  where p.payment_Id = :payment_Id")
//	void update(@Param("payment_Type") String name,@Param("amount") double amount,@Param("payment_Id")int payment_Id);
//	
	

}