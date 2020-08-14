package com.canalogies.initial.test;

import org.springframework.stereotype.Component;

@Component
public class RestFortune implements FortuenService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "REST fortune";
	}

}
