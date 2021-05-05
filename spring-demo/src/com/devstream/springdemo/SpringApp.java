package com.devstream.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
//		load the spring configurations
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		gets bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
//		call methods on the bean
		System.out.println(theCoach.getDailyRoutine());
		System.out.println(theCoach.getDailyFortune());
		
//		close the context
		context.close();
	}
}