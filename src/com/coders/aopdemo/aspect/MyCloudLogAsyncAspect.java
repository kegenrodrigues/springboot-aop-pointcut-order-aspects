package com.coders.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLogAsyncAspect {

	@Before("forDaoPackageNoGettersAndSetters()")
	public void logToCloudSync() {
		System.out.println("Buddy we are in the logging Aspect. logging to cloud in async fashion");
	}
	
}
