package com.devstream.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		// check they are same or not
		boolean same = coach1 == coach2;
		System.out.println("Are they same? " + same);
		System.out.println("coach1 memory address: " + coach1);
		System.out.println("coach2 memory address: " + coach2);
		
		context.close();
	}

}
