package com.luv2code.springdemo.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	// setup Logger
	private final Logger myLogger = Logger.getLogger(getClass().getName());
	
	// setup point cut declaration for controller
	@Pointcut("execution (* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {}
	
	// setup point cut declaration for dao
	@Pointcut("execution (* com.luv2code.springdemo.dao.*.*(..))")
	private void forDaoPackage() {}
		
	// setup point cut declaration for service
	@Pointcut("execution (* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage() {}
	
	// setup final point cut
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {}
	
	
	// Add annotation advice @Before
	@Before(value="forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("====>> in Before: Calling method: " + theMethod);
		
		Object[] args = theJoinPoint.getArgs();
		
		for(Object temp : args) {
			myLogger.info("====>> argument: " + temp);
		}
		
	}
	
	
	@AfterReturning(value="forAppFlow()" , returning="theResult")
	public void afterreturning(JoinPoint theJoinPoint , Object theResult) {
		
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("====>> in AfterReturning: from method: " + theMethod);
		
		
		myLogger.info("====>> Result : " + theResult);
	}
	
}
