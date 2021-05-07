package com.devstream.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach bean = context.getBean("newCoach", Coach.class);
		Coach swimBean = context.getBean("swimmingCoach", Coach.class);
		System.out.println(bean.getDailyWorkout());
		System.out.println(swimBean.getDailyWorkout());
		context.close();

	}

}
