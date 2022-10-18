package dataAccess;

import entities.Category;

public class Hibernate implements ICategory{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate kategori eklendi");
		
	}

}
