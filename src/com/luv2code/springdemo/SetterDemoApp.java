package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassPathXmlApplicationContext myContainer = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	TrackCoach myCoach = myContainer.getBean("myTrackCoach",TrackCoach.class);
	
	
	System.out.println(myCoach.getDailyWorkout());
	System.out.println(myCoach.name());
	System.out.println(myCoach.getFortune());
	System.out.println(myCoach.getEmailAddress());
	System.out.println(myCoach.getTeam());
	myContainer.close();
	}

}
