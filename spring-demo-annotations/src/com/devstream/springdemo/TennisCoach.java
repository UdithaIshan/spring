package com.devstream.springdemo;

import org.springframework.stereotype.Component;

@Component("newCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TennisCoach";
	}

}
