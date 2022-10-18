package dataAccess;

import entities.Instructore;

public class HibernateInstructore implements IInstructore{

	@Override
	public void add(Instructore instructore) {
		System.out.println("Hibernate eğitmen eklendi.");
		
	}

}
