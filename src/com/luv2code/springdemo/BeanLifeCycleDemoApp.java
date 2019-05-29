package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//load the spring configuration file
		ClassPathXmlApplicationContext myContainer = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach thCoach = myContainer.getBean("myCoach",Coach.class);
		
		System.out.println(thCoach.getDailyWorkout());
		myContainer.close();
	}

}
