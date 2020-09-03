package com.gdcp.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Pointcut("execution(* com.gdcp.aspectj.annotation.*.*(..))")
	private void myPointCut(){}
	
	@Before("myPointCut()")
	public void myBefore(JoinPoint joinPoint){
		System.out.println("myBefore前置通知");
		System.out.println("myBefore目标类"
				+ joinPoint.getTarget());
		System.out.println("myBefore前置通知"
				+joinPoint.getSignature().getName());
	}
	
	@AfterReturning("myPointCut()")
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("myAfterReturning后置通知");
		System.out.println("myAfterReturning目标类"
				+ joinPoint.getTarget());
		System.out.println("myAfterReturning后置通知"
				+joinPoint.getSignature().getName());
	}
	
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("myAround环绕通知开始"
				+proceedingJoinPoint.getSignature().getName());
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("myAround环绕通知结束"
				+proceedingJoinPoint.getSignature().getName());
		return obj;
	}
	
	@AfterThrowing(value="myPointCut()", throwing = "e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
		System.out.println("myAfterThrowing异常通知：出错了"+e.getMessage());
	}
	
	@After("myPointCut()")
	public void myAfter(){
		System.out.println("myAfter异常通知：出错了");
	}

}
