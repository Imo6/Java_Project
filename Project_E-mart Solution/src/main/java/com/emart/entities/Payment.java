package com.emart.entities;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_Id;
	//private int order_Id;
	private String payment_Type;
	private double amount;
	private Orders Orders;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="order_Id")
	public Orders getOrders() {
		return Orders;
	}


	public void setOrders(Orders orders) {
	Orders = orders;
	}


	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getpayment_Id() {
		return payment_Id;
	}
	public Payment(int payment_Id, String payment_Type, double amount, Orders orders) {
		super();
		this.payment_Id = payment_Id;
		this.payment_Type = payment_Type;
		this.amount = amount;
		Orders = orders;
	}


	
	public void setpayment_Id(int payment_Id) {
		this.payment_Id = payment_Id;
	}
	
	public String getpayment_Type() {
		return payment_Type;
	}
	
	public void setpayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}
	
	
	public double getamount() {
		return amount;
	}
	
	public void setamount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Product [payment_Id=" + payment_Id + ", payment_Type=" + payment_Type + ", amount=" + amount + "]";
	};
	
}
