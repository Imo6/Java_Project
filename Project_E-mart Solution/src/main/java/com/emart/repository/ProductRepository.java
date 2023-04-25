package com.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emart.entities.Category;
import com.emart.entities.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Integer> 
{
	@Modifying
	@Query("from Product  where cat_Id=:category_Id")
	List<Product> getProducts(@Param("category_Id")int category_Id );
	
}
