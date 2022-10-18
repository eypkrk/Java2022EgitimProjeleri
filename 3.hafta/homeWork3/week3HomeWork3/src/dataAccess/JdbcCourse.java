package dataAccess;

import entities.Course;

public class JdbcCourse implements ICourse{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ders eklendi.");
		
	}

}
