package com.emart.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Category;
import com.emart.repository.CategoryRepository;


@Service
public class CategoryManagerImpl implements CategoryManager
{
	@Autowired
	CategoryRepository repository;

	@Override
	public void addCategory(Category c) {
		repository.save(c);
		
		
	}

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	
	@Override
	public Optional<Category> getCategory(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	/* @Override
	public void update(Category category,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		repository.update(category.getCategory_Name(),category.getParentcategory_Id(),category.getCategory_Img_Path(),category.isFlag(),id);
	} */


	@Override
	public List<Category> getSelectedCat() {
		// TODO Auto-generated method stub
		return repository.listCategory();
	}
	@Override
	public List<Category> getSubCategories(int category_Id)
	{
		return repository.getSubCategories(category_Id);
	}

}