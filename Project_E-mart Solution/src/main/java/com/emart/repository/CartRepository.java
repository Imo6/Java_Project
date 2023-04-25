package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emart.entities.Cart;



@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart,Integer> {

}

