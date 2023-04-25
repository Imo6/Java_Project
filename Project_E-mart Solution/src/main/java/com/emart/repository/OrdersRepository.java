package com.emart.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emart.entities.Orders;




@Repository
@Transactional
public interface OrdersRepository extends JpaRepository<Orders,Integer>
{
	
 @Modifying
 @Query("update Orders o set o.order_Date=:date,o.order_Total=:total where o.order_Id=:oid")
 void update(@Param("date")LocalDate date,@Param("total")double total,@Param("oid")int oid);
 
 
 @Modifying
 @Query("SELECT o.orderId as orderId, o.orderDate as orderDate, o.orderTotal as orderTotal, c.cartId as cartId, ci.cartItemId as cartItemId, ci.quantity as quantity, ci.cartItemTotal as cartItemTotal, p.productId as productId, p.productName as productName, p.productPrice as productPrice " +
         "FROM Orders o " +
         "JOIN o.cart c " +
         "JOIN c.cartItem ci " +
         "JOIN ci.product p " +
         "WHERE o.orderId = :orderId")
 List<Orders> findOrdersByCustomerId(@Param("customerId") Long customerId);
}


