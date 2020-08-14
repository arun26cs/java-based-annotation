package com.canalogies.initial.test;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuenService {

	String[] data = {"Hello","hell","llo"};
	private Random myrandom = new Random();
	@Override
	public String getFortune() {
		int idx = myrandom.nextInt(data.length);
		return data[idx];
	}

}
