package com.emart.entities;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "config")
public class Configuration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int config_Id;
	private String config_Name;
	private String config_Details;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "conf_Id", referencedColumnName="config_Id")
	private Set<ProductDetails> pd_Id;

	public Configuration(String config_Name, String config_Details, Set<ProductDetails> pd_Id) {
		super();
		this.config_Name = config_Name;
		this.config_Details = config_Details;
		this.pd_Id = pd_Id; //prodtl id
	}
	

	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Configuration [config_Id=" + config_Id + ", config_Name=" + config_Name + ", config_Details="
				+ config_Details + ", pd_Id=" + pd_Id + "]";
	}
	public int getConfig_Id() {
		return config_Id;
	}

	public void setConfig_Id(int config_Id) {
		this.config_Id = config_Id;
	}

	public String getConfig_Name() {
		return config_Name;
	}

	public void setConfig_Name(String config_Name) {
		this.config_Name = config_Name;
	}

	public String getConfig_Details() {
		return config_Details;
	}

	public void setConfig_Details(String config_Details) {
		this.config_Details = config_Details;
	}
	
	public Set<ProductDetails> getPd_Id() {
		return pd_Id;
	}

	public void setPd_Id(Set<ProductDetails> pd_Id) {
		this.pd_Id = pd_Id;
	}
	
	

}