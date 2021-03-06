package com.canalogies.initial.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(tennisCoach.getAdvise());
		System.out.println(tennisCoach.getDailyWorkout());
		
		context.close();
	}
}
