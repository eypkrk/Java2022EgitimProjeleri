package week3HomeWork3;

import dataAccess.Hibernate;
import dataAccess.HibernateCourse;
import dataAccess.HibernateInstructore;
import dataAccess.HibernateStudent;
import dataAccess.JdbcCategory;
import dataAccess.JdbcCourse;
import dataAccess.JdbcInteructore;
import dataAccess.JdbcStudent;
import dataLogger.DatabaseLogger;
import dataLogger.FileLogger;
import dataLogger.Logger;
import dataLogger.MailLogger;
import entities.Category;
import entities.Course;
import entities.Instructore;
import entities.Student;
import manager.CategoryManager;
import manager.CourseManager;
import manager.InstructoreManager;
import manager.StudentManager;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Eyüp");
		
		StudentManager studentManager = new StudentManager(new HibernateStudent(), loggers);
		StudentManager studentManager2 = new StudentManager(new JdbcStudent(), loggers);
		studentManager.add(student1);
		studentManager2.add(student1);
		
		Instructore instructore = new Instructore();
		instructore.setId(1);
		instructore.setName("Engin Demiroğ");
		
		InstructoreManager ınstructoreManager = new InstructoreManager(new HibernateInstructore(), loggers);
		InstructoreManager ınsstructoreManager2 = new InstructoreManager(new JdbcInteructore(), loggers);
		ınstructoreManager.add(instructore);
		ınsstructoreManager2.add(instructore);
		
		Category category = new Category();
		category.setId(1);
		category.setName("Yazılım");
		
		CategoryManager categoryManager = new CategoryManager(new Hibernate(), loggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategory(), loggers);
		categoryManager.add(category);
		categoryManager2.add(category);
		
		Course course = new Course();
		course.setId(1);
		course.setCourseName("Java Yazılım Geliştirici Yetiştirme Kampı");
		
		CourseManager courseManager = new CourseManager(new HibernateCourse(), loggers);
		CourseManager courseManager2 = new CourseManager(new JdbcCourse(), loggers);
		courseManager.add(course);
		courseManager2.add(course);

	}

}
