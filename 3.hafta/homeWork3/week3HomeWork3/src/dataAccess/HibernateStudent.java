package dataAccess;

import entities.Student;

public class HibernateStudent implements IStudent{

	@Override
	public void add(Student student) {
		System.out.println("Hibernate öğrenci eklendi.");
		
	}

}
