package com.canalogies.initial.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigrationAnnotationDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(tennisCoach.getAdvise());
		System.out.println(tennisCoach.getDailyWorkout());
		
		context.close();
	}
}
