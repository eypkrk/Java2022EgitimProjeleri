package manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataAccess.ICourse;
import dataLogger.Logger;
import entities.Course;

public class CourseManager {
	private ICourse ıcourse;
	private Logger[] loggers;
	private List<String> courseNames = new ArrayList<>();
	
	public CourseManager(ICourse ıcourse, Logger[] loggers){
		this.ıcourse = ıcourse;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception {
		for (String courseName : courseNames) {
			if(courseName == course.getCourseName()) {
				throw new Exception("Aynı isimde kurs olamaz!");
			}
			else {
				courseNames.add(courseName);
				ıcourse.add(course);
				
				for (Logger logger : loggers) {
					logger.add(course.getCourseName());
				}
			}
		}
	}
}

