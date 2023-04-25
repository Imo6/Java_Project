package com.emart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emart.entities.Customer;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer,Integer> 
{
	@Modifying
	@Query("update Customer c set c.username = :username, c.password=:password,c.prime_Customer = :primeCustomer, c.wallet=:wallet, c.first_Name=:firstname,c.last_Name=:lastname,c.email_Id=:emailId,c.address=:address where c.customer_Id = :customerId")
	void update(@Param("username") String username,@Param("password")String password,@Param("primeCustomer") boolean primeCustomer,@Param("wallet") int wallet,@Param("firstname") String firstname,@Param("lastname") String lastname,@Param("emailId") String emailId,@Param("address") String address,@Param("customerId")int customerId);
	
	@Query("from Customer c where c.username=:user")
	Optional<Customer> listUser(@Param("user") String user);
}