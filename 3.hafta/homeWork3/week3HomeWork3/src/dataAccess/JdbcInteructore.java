package dataAccess;

import entities.Instructore;

public class JdbcInteructore implements IInstructore{

	@Override
	public void add(Instructore instructore) {
		System.out.println("JDBC instructore eklendi.");
		
	}

}
