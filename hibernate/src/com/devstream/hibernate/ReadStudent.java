package com.devstream.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.devstream.hibernate.entity.Student;

public class ReadStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
//			Student newStudent = new Student("J2" ,"Do", "jd@gmail.com");
//			session.beginTransaction();
//			session.save(newStudent);
//			session.getTransaction().commit();
			
			// read from db
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student readData = session.get(Student.class, "1");
			System.out.println(readData);
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
