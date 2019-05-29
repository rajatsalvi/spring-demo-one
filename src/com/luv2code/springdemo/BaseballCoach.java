package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneservice;
	
	BaseballCoach(FortuneService thefortuneservice){
	 fortuneservice = thefortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes";
	}
	@Override
	public String name() {
		return "This is my name";
	}
	@Override
	public String footballList() {
		// TODO Auto-generated method stub
		return "This is not in this list";
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	//add an init method
	public void doMyStartUpStuff() {
		System.out.println("BaseballCoach inside  method doMyStartStuff.");
	}
	//add an destroy method
	public void doMyCleanUpStuff() {
		System.out.println("BaseballCoach inside method doMyCleanUpStuff.");
	}
	
}
