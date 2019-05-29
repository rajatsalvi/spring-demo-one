package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneservice;
	
	
	private String emailAddress;
	private String team;
	
	
	//create no args for constructor
	public TrackCoach() {
		System.out.println("TrackCoach inside : no argument in constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("TrackCoach inside : no argument in setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("TrackCoach inside : no argument in setter method - setTeam");
		this.team = team;
	}


	//our setter method
	public void setFortuneService(FortuneService fortuneservice) {
		System.out.println("TrackCoach inside : no argument in setter method - setFortuneservice");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Rajat";
	}

	@Override
	public String footballList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
