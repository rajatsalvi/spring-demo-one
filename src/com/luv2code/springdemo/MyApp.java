package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Coach theCoach = new BaseballCoach(null);
  System.out.println(theCoach.getDailyWorkout());
  Coach theName = new BaseballCoach(null);
  System.out.println(theName.name());
	
	}

}
