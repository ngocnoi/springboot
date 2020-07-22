package com.group5.librarymanagement.Service;

import java.util.List;

import com.group5.librarymanagement.Entity.Category;

public interface CategoryService {
	public abstract Category getCategory(Integer id);
	public abstract void addCategory(Category category);
	public abstract void updateCategory(Category category, Integer id);
	public abstract void deleteCategory(Integer id);
	public abstract List<Category> listCategory();	
}
