package dataAccess;

import entities.Student;

public class JdbcStudent implements IStudent{

	@Override
	public void add(Student student) {
		System.out.println("JDBC öğrenci eklendi.");
		
	}

}
