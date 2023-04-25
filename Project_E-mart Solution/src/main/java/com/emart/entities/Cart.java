package com.emart.entities;




import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cart_Id;
	@Column(name="total_Cost")
	private Double total_Cost;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="c_Id")
	private Customer customer;

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_Id_fk",referencedColumnName="cart_Id")
	private Set<CartItem> cartitem;
	
	
	
	public Cart(){
		super();
	}
	
	

	public Cart(int cart_Id, Double total_Cost, Customer customer,Set<CartItem> cartitem) {
		super();
		this.cart_Id = cart_Id;
		this.total_Cost = total_Cost;
		this.customer = customer;
		this.cartitem = cartitem;
	}



	public int getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(int cart_Id) {
		this.cart_Id = cart_Id;
	}
	public Double getTotal_Cost() {
		return total_Cost;
	}
	public void setTotal_Cost(Double total_Cost) {
		this.total_Cost = total_Cost;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<CartItem> getCartitem() {
		return cartitem;
	}
	public void setCartitem(Set<CartItem> cartitem) {
		this.cartitem = cartitem;
	}
	

}