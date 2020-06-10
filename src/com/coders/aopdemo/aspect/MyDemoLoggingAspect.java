package com.coders.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//Pointcut for getters
	@Pointcut("execution(* com.coders.aopdemo.dao.*.get*(..))")
	private void forGetters() {};

	//Pointcut for setters
	@Pointcut("execution(* com.coders.aopdemo.dao.*.set*(..))")
	private void forSetters() {};
	
	//Pointcut for dao package
	@Pointcut("execution(* com.coders.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {};
	
	//Poincut for Dao Package Exclude Getters  And Setters
	@Pointcut("forDaoPackage() && !(forSetters()||forGetters())")
	private void forDaoPackageNoGettersAndSetters() {};	
	
	@Before("forDaoPackageNoGettersAndSetters()")
	public void runBeforeAddAccount() {
		System.out.println("Buddy we are in the logging Aspect. runBeforeAddAccount");
	}
	
	@Before("forDaoPackageNoGettersAndSetters()")
	public void preApiAnalytics() {
		System.out.println("Buddy we are in the logging Aspect. preApiAnalytics going on");
	}
}
