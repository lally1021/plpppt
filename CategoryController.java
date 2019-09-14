package com.capgemini.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.category.bean.Category;
import com.capgemini.category.service.CategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CategoryController {
	@Autowired
   private CategoryService catgService;
	
	@GetMapping
	public List<Category> getAllCategories(){
		return catgService.getAllCategories();
	}
	@PostMapping
	public List<Category> addCategory(@RequestBody Category category){
		return catgService.addCategory(category);
	}
	@DeleteMapping("{id}")
	public List<Category> deleteCategory(@PathVariable int id){
		return catgService.deleteCategory(id);
	}
	@PutMapping("{id}")
	public List<Category> updateCategory(@PathVariable int id,@RequestBody Category category){
		return catgService.updateCategory(id,category);
	}
	@GetMapping("{id}")
	public Category getById(@PathVariable int id)
	{
		return catgService.getByid(id);
	}
	
}
