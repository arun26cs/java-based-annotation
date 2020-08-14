package com.canalogies.initial.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeMyApp {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1 = context.getBean("tennisCoach",Coach.class);
		
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		//to test if the scope is singleton or prototype
		System.out.println(coach1==coach2);
		
		context.close();
	}
}
