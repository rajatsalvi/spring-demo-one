package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//load the spring configuration file
		ClassPathXmlApplicationContext myContainer = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach thCoach = myContainer.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = myContainer.getBean("myCoach",Coach.class);
		
		//check if they are the same beans
		
		boolean result = (thCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object:  "+result);
		
		System.out.println("\nMemory location for the thcoach:  "+thCoach);
		
		System.out.println("\nMemory location for the alphaCoach:  "+alphaCoach);
	}

}
