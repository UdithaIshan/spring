package com.devstream.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.devstream.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Student newStudent = new Student("John222" ,"Doe222", "jd@gmail.com");
			session.beginTransaction();
			session.save(newStudent);
			session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
