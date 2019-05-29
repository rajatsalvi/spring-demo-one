package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneservice;
	
	public FootballCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}
	public String footballList() {
		return "Practive for 2hrs";
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "10hrs";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Vijay";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Just Do it"+fortuneservice.getFortune();
	}
}
