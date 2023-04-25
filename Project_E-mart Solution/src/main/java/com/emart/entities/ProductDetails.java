package com.emart.entities;



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
@Table(name = "PRODUCTDETAILS")
public class ProductDetails {
	
	private int productDetail_Id;
	private String p_Description;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="p_Id")
	private Product product;

	public ProductDetails(int productDetail_Id, String p_Description, Product product) {
		super();
		this.productDetail_Id = productDetail_Id;
		this.p_Description = p_Description;
		this.product = product;
	}

	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getProductDetail_Id() {
		return productDetail_Id;
	}

	public void setProductDetail_Id(int productDetail_Id) {
		this.productDetail_Id = productDetail_Id;
	}

	public String getP_Description() {
		return p_Description;
	}

	public void setP_Description(String p_Description) {
		this.p_Description = p_Description;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductDetails [productDetail_Id=" + productDetail_Id + ", p_Description=" + p_Description
				+ ", product=" + product + "]";
	}
	
	
	
	
	
	
}
