package com.emart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="cartitem")
public class CartItem {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cart_Item_Id;
private int quantity;
private double cart_Item_Total;
private double prime_CustomerPrice;
@ManyToOne(cascade=CascadeType.ALL)
private Product product;


public CartItem() {
	super();
}

public CartItem(int cart_Item_Id, int quantity, double cart_Item_Total, double prime_CustomerPrice, Product product) {
	super();
	this.cart_Item_Id = cart_Item_Id;
	this.quantity = quantity;
	this.cart_Item_Total = cart_Item_Total;
	this.prime_CustomerPrice = prime_CustomerPrice;
	this.product = product;
}

public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public int getCart_Item_Id() {
	return cart_Item_Id;
}
public void setCart_Item_Id(int cart_Item_Id) {
	this.cart_Item_Id = cart_Item_Id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getCart_Item_Total() {
	return cart_Item_Total;
}
public void setCart_Item_Total(double cart_Item_Total) {
	this.cart_Item_Total = cart_Item_Total;
}

public double getPrime_CustomerPrice() {
	return prime_CustomerPrice;
}

public void setPrime_CustomerPrice(double prime_CustomerPrice) {
	this.prime_CustomerPrice = prime_CustomerPrice;
}

@Override
public String toString() {
	return "CartItem [cart_Item_Id=" + cart_Item_Id + ", quantity=" + quantity + ", cart_Item_Total=" + cart_Item_Total
			+ ", product=" + product + "]";
}




}