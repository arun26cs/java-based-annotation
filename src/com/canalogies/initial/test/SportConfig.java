package com.canalogies.initial.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.canalogies")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for sad fortune service
	@Bean
	public FortuenService sadFortune() {
		return new SadFortune();
	}
	
	//bean int with the constructoe as sad fortune
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortune());
	}
	
	
	
}
