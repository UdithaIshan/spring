package com.devstream.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyRoutine() {
		return "get daily routine";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}
}
