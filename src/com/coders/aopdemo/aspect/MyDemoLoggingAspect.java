package com.coders.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@Before("com.coders.aopdemo.aspect.AopExpressions.forDaoPackageNoGettersAndSetters()")
	public void runBeforeAddAccount() {
		System.out.println("Buddy we are in the logging Aspect. runBeforeAddAccount");
	}
		
}
