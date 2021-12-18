package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setCourseName("Java");
		
		Course course2 = new Course();
		course2.setCourseName("HTML");
		
		Student s1 = new Student();
		s1.setName("Raj");
		s1.setCourse(course1);
		
		Student s2 = new Student();
		s2.setName("Abhishek");
		s2.setCourse(course2);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(course1);
		session.save(course2);
		
		session.save(s1);
		session.save(s2);
		
		session.getTransaction().commit();
		session.close();

	}

}
