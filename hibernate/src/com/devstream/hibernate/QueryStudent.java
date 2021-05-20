package com.devstream.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.devstream.hibernate.entity.Student;

public class QueryStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
//			List<Student> studentList = session.createQuery("from Student").getResultList();
			List<Student> studentList = session.createQuery("from Student where lastName='ishan' or firstName='john'").getResultList();
			for(Student student : studentList) {
				System.out.println(student);
			}
			session.getTransaction().commit();
			
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
