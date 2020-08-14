package com.canalogies.initial.test;

public class SwimCoach implements Coach {

	private FortuenService fortuneService;
	
	public SwimCoach(FortuenService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getAdvise() {
		return "Swim advise";
	}

	@Override
	public String getDailyWorkout() {
		return "Swim daily 10 hrs";
	}

}
