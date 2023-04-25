package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.Category;

public interface CategoryManager
{
	void addCategory(Category c);
	List<Category> getCategories();
	void delete(int id);
	//void update(Category category,int id);
	Optional<Category> getCategory(int id);
	List<Category> getSelectedCat();
	List<Category> getSubCategories(int category_Id);
}