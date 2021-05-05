package com.devstream.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach1.getDailyFortune());
		
		context.close();
	}

}
