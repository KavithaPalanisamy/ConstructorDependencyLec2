package com.kavi.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		System.out.println("Before configuring application context");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DiscussThrowCoach coach = context.getBean("discussThrowCoach", DiscussThrowCoach.class);
		HappyFortuneService fortune = context.getBean("happyFortune", HappyFortuneService.class);
//		System.out.println(coach.getDailyWorkouts());
//		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
