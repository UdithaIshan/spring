package com.devstream.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
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
