package com.emart.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emart.entities.Category;

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category,Integer> 
{
	/*
	@Modifying
	@Query("update Category c set c.category_Name = :name, c.parentCategory_Id=:c_Id,c.category_Img_Path = :img, c.flag=:flag where c.category_Id = :id")
	void update(@Param("name") String name,@Param("c_Id")int c_Id,@Param("img") String img,@Param("flag") boolean flag,@Param("id")int id);
	*/
	
	@Query("from Category c where c.parentcategory_Id=0")
	List<Category> listCategory();
	
	@Query("from Category c where c.parentcategory_Id=:category_Id")
	List<Category> getSubCategories(@Param("category_Id") int category_Id);
}