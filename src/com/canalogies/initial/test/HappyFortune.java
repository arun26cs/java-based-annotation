package com.canalogies.initial.test;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuenService {

	@Override
	public String getFortune() {
		 
		return "you arein Happy fortune";
	}

	

}
