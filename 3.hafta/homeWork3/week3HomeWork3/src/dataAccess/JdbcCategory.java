package dataAccess;

import entities.Category;

public class JdbcCategory implements ICategory{

	@Override
	public void add(Category category) {
		System.out.println("JDBC kategori eklendi.");
		
	}

}
