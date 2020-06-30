package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach anotherCoach = context.getBean("myCoach",Coach.class);
	    System.out.println(theCoach==anotherCoach); //returns true or false
		System.out.println("Memory location " +theCoach);
		System.out.println("Memory location " +anotherCoach);
		
		
	}

}
