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
@Table(name = "Category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int category_Id;
	private String category_Name;
	private int parentcategory_Id;
	private String category_Img_Path;
	private boolean flag;
	
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "cat_Id", referencedColumnName="category_Id")
	 private Set<Product> cat_Id;
	 
	 
	 
	 
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(int category_Id, String category_Name, int parentcategory_Id, String category_Img_Path,
			boolean flag, Set<Product> cat_Id) {
		super();
		this.category_Id = category_Id;
		this.category_Name = category_Name;
		this.parentcategory_Id = parentcategory_Id;
		this.category_Img_Path = category_Img_Path;
		this.flag = flag;
		this.cat_Id = cat_Id;
	}

	public int getCategory_Id() {
		return category_Id;
	}

	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}

	public String getCategory_Name() {
		return category_Name;
	}

	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}

	public int getParentcategory_Id() {
		return parentcategory_Id;
	}

	public void setParentcategory_Id(int parentcategory_Id) {
		this.parentcategory_Id = parentcategory_Id;
	}

	public String getCategory_Img_Path() {
		return category_Img_Path;
	}

	public void setCategory_Img_Path(String category_Img_Path) {
		this.category_Img_Path = category_Img_Path;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Set<Product> getCat_Id() {
		return cat_Id;
	}

	public void setCat_Id(Set<Product> cat_Id) {
		this.cat_Id = cat_Id;
	}

	@Override
	public String toString() {
		return "Category [category_Id=" + category_Id + ", category_Name=" + category_Name + ", parentcategory_Id="
				+ parentcategory_Id + ", category_Img_Path=" + category_Img_Path + ", flag=" + flag + ", cat_Id="
				+ cat_Id + "]";
	}
	
	
	

	
	
	
	 
	
	
}
