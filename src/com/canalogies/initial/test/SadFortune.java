package com.canalogies.initial.test;

import org.springframework.stereotype.Component;

@Component
public class SadFortune implements FortuenService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Sad fortune";
	}

}
