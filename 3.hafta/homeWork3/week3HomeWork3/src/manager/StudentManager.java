package manager;

import dataAccess.IStudent;
import dataLogger.Logger;
import entities.Student;

public class StudentManager {
	private IStudent ıstudent;
	private Logger[] loggers;
	
	public StudentManager(IStudent ıstudent, Logger[] loggers) {
		this.ıstudent = ıstudent;
		this.loggers = loggers;
	}
	
	public void add(Student student) {
		System.out.println("Eklendi");
		ıstudent.add(student);
		for (Logger logger : loggers) {
			logger.add(student.getName());
		}
	}

}
