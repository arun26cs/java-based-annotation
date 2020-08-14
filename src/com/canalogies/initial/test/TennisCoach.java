package com.canalogies.initial.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component 
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortune")
	private FortuenService fortuneService;
	
	@Value("${foo.team}")
	public String team;
	
	@Value("${foo.email}")
	public String email;
	
	public TennisCoach() {
		 
	}
	
	
	//init method
	@PostConstruct
	public void initMethod() {
		System.out.println("after construction");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("before destruction");
	}
//	public TennisCoach(FortuenService fortuneService) {
//		 this.fortuneService = fortuneService;
//	}
	//when the setter is running as injector then it 
//	@Autowired
//	public void setFortuneService(FortuenService fortuneService) {
//		this.fortuneService = fortuneService;
//	}


	@Override
	public String getAdvise() {
		return "advise from Tennis silly Anootated coach "+fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		 
		return "daily workout "+" "+team+" "+email;
	}
	
//	@Autowired
//	public void customnmae(FortuenService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("custome fortune service autowire");
//	}

}
