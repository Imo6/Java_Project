package com.emart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Product")
public class Product
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int p_Id;
	private String p_Name;
	private float p_Price;
	private String p_Image;
	private boolean p_Prime;
	private boolean p_Promotion;
   
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int p_Id, String p_Name, float p_Price, String p_Image, boolean p_Prime, boolean p_Promotion) 
	{
			super();
			this.p_Id = p_Id;
			this.p_Name = p_Name;
			this.p_Price = p_Price;
			this.p_Image = p_Image;
			this.p_Prime = p_Prime;
			this.p_Promotion = p_Promotion;
		}
	
	public int getP_Id() {
		return p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public float getP_Price() {
		return p_Price;
	}

	public void setP_Price(float p_Price) {
		this.p_Price = p_Price;
	}

	public String getP_Image() {
		return p_Image;
	}

	public void setP_Image(String p_Image) {
		this.p_Image = p_Image;
	}

	public boolean getP_Prime() {
		return p_Prime;
	}

	public void setP_Prime(boolean p_Prime) {
		this.p_Prime = p_Prime;
	}

	public boolean getP_Promotion() {
		return p_Promotion;
	}

	public void setP_Promotion(boolean p_Promotion) {
		this.p_Promotion = p_Promotion;
	}

	



	@Override
	public String toString() {
		return "Product [p_Id=" + p_Id + ", p_Name=" + p_Name + ", p_Price=" + p_Price + ", p_Image=" + p_Image
				+ ", p_Prime=" + p_Prime + ", p_Promotion=" + p_Promotion + "]";
	}
	 
	 
}
