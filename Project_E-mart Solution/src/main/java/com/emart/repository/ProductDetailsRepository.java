package com.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.entities.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails,Integer> 
{
	@Modifying
	@Query("from ProductDetails c where c.product.p_Id=:product")
	List<ProductDetails> getDetails(@Param("product") int product);
}
