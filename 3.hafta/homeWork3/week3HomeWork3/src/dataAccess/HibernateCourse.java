package dataAccess;

import entities.Course;

public class HibernateCourse implements ICourse{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ders eklendi.");
		
	}

}
