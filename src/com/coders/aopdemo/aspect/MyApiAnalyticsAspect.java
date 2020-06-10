package com.coders.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyApiAnalyticsAspect {

	@Before("forDaoPackageNoGettersAndSetters()")
	public void myApiAnalytics() {
		System.out.println("Buddy we are in the logging Aspect. myApiAnalytics going on");
	}
	
}
