package manager;

import java.util.ArrayList;
import java.util.List;

import dataLogger.Logger;
import entities.Category;
import dataAccess.ICategory;
import entities.Course;

public class CategoryManager {
	private ICategory ICategory;
	private Logger[] logger;
	private List<String> categoryNames = new ArrayList<>();
	
	public CategoryManager(ICategory ıcategory, Logger[] logger) {
		this.ICategory = ıcategory;
		this.logger = logger;
	}
	
	public void add(Category category) throws Exception {
		for (String categoryName : categoryNames) {
			if(category.getName() == categoryName) {
				throw new Exception("Bu kategori sistemde mevcut!");
			}
			else {
				categoryNames.add(categoryName);
				ICategory.add(category);
				
				for (Logger logger : logger) {
					logger.add(category.getName());
				}
			}
		}
	}
}

