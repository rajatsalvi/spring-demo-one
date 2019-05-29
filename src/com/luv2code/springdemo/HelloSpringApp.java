package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the configuration file
  ClassPathXmlApplicationContext mycontainer = new ClassPathXmlApplicationContext("applicationContext.xml");
  //retrieve the bean from spring container
  Coach theCoach = mycontainer.getBean("myCoach",Coach.class);
  Coach foCoach = mycontainer.getBean("myfootballCoach",Coach.class);
  //call method on the beam
  System.out.println(theCoach.getDailyWorkout());
  System.out.println(foCoach.getFortune());
  System.out.println(theCoach.name());
  System.out.println(foCoach.name());
  System.out.println(theCoach.getFortune());
  
  mycontainer.close();
	}

}
