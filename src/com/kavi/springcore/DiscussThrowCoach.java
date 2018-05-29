package com.kavi.springcore;

public class DiscussThrowCoach implements Coach {

	private FortuneService fortune;

	public FortuneService getFortune() {
		System.out.println("Inside getter of fortune service!!!");
		return fortune;
	}

	public void setFortune(FortuneService fortune) {
		System.out.println("Inside setter of fortune service!!!");
		this.fortune = fortune;
	}

	public DiscussThrowCoach() {
		System.out.println("Inside DiscussThrow default constructor");
	}

	public DiscussThrowCoach(FortuneService f) {
		System.out.println("Inside DiscussThrow one arg constructor");
		fortune = f;
	}

	@Override
	public String getDailyWorkouts() {
		return "Run for 10 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
