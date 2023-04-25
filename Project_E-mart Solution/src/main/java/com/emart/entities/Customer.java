package com.emart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer 
{
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_Id;
	private String username;
	private String password;
	private boolean prime_Customer;
	private int wallet;
	private String first_Name;
	private String last_Name;
	private String email_Id;
	private String address;
	
	
	
	public Customer(int customer_Id, String username, String password, boolean prime_Customer, int wallet,String first_Name,String last_Name,String email_Id,String address  ) {
		super();
		this.customer_Id = customer_Id;
		this.username = username;
		this.password = password;
		this.prime_Customer = prime_Customer;
		this.wallet = wallet;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email_Id = email_Id;
		this.address = address;
	}
	
	public int getcustomer_Id() {
		return customer_Id;
	}
	
	public void setcustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	
	public String getusername() {
		return username;
	}
	
	public void setusername(String username) {
		this.username = username;
	}
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	public boolean getprime_Customer() {
		return prime_Customer;
	}
	
	public void setprime_Customer(boolean prime_Customer) {
		this.prime_Customer = prime_Customer;
	}
	
	public int getwallet() {
		return wallet;
	}
	
	public void setwallet(int wallet) {
		this.wallet = wallet;
	}
	
	public String getfirst_Name() {
		return first_Name;
	}
	
	public void setfirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	
	public String getlast_Name() {
		return last_Name;
	}
	
	public void setlast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	
	public String getemail_Id() {
		return email_Id;
	}
	
	public void setemail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [CustomerID=" + customer_Id + ", Username=" + username + ", Password=" + password + ", PrimeCustomer=" + prime_Customer
				+ ", Wallet=" + wallet +  ", FirstName=" + first_Name +  ", LastName=" + last_Name +  ", EmailId=" + email_Id +  ", Address=" + address +"]";
	};
	
}
