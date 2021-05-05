package com.devstream.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Happy Fortune Srevice";
	}

}
