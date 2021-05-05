package com.devstream.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
//		load the spring configurations
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		gets bean from spring container
		Coach theCoach = context.getBean("myCoach", BaseballCoach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
//		call methods on the bean
		System.out.println(theCoach.getDailyRoutine());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmail());
		
//		close the context
		context.close();
	}
}