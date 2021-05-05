package com.devstream.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
	private String email;
	private String country;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach is in " + this.fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyRoutine() {
		// TODO Auto-generated method stub
		return null;
	}

}
