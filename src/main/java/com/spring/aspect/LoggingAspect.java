package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before ("execution (* com.spring.logic.UserImpl.*(*))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("\nlogBefore is executing .... ");
		System.out.println("On Execution of - " + joinPoint.getSignature().getName() + "\n");
	}
	
	@After ("execution (void com.spring.logic.UserImpl.*(*, *))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("\nlogAfter is executing .... ");
	}

	@AfterReturning (pointcut = "execution (* com.spring.logic.UserImpl.*(*, *))")
	public void logAfterReturning(JoinPoint joinPoint) {
		System.out.println("\nlogAfterReturning is executing for -- " + joinPoint.getSignature().getName() + "\n");
	}
	
	@Around("execution (* com.spring.logic.UserImpl.*())")
	public void logAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("logAround is running for - " + jp.getSignature().getName());
		jp.proceed();
		System.out.println("logAround after is executing ");
	}
	
	@AfterThrowing (pointcut="execution(* com.spring.logic.UserImpl.*(*))", throwing="err")
	public void logForException(JoinPoint jp, Throwable err) {
		System.out.println("log for Exception occured - " + err);
	}

}
