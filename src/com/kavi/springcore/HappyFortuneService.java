package com.kavi.springcore;

public class HappyFortuneService implements FortuneService {
	private String fortuneText;
	
	public HappyFortuneService() {
		System.out.println("Inside Fortune Service default constructor ");
	}

	@Override
	public String getFortune() {
		return fortuneText;
	}

	public String getFortuneText() {
		System.out.println("Inside Getter method of Fortune text");
		return fortuneText;
	}

	public void setFortuneText(String fortuneText) {
		System.out.println("Inside Setter method of Fortune text");
		this.fortuneText = fortuneText;
	}

}
