package com.devstream.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Im the new swimming coach";
	}

}
