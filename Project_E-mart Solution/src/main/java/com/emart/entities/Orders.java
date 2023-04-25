package com.emart.entities;

import java.time.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_Id;
	
	@Column(name="order_Date")
	private LocalDate order_Date;
	
	@Column(name="order_Total")
	private Double order_Total;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_Id_fk")
    private Cart cart;
	
	
	
	public Orders(){
		super();
	}
	
	public Orders(int order_Id, LocalDate order_Date, Double order_Total, Cart cart) {
		super();
		this.order_Id = order_Id;
		this.order_Date = order_Date;
		this.order_Total = order_Total;
		this.cart = cart;
	}

	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	public LocalDate getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(LocalDate order_Date) {
		this.order_Date = order_Date;
	}
	public Double getOrder_Total() {
		return order_Total;
	}
	public void setOrder_Total(Double order_Total) {
		this.order_Total = order_Total;
	}
	

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Orders [order_Id=" + order_Id + ", order_Date=" + order_Date + ", order_Total=" + order_Total
				+ ", cart_Id=" + "]";
	}
	
	

}
