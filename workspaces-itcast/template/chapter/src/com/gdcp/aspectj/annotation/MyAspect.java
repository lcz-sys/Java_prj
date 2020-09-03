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
		System.out.println("myBeforeǰ��֪ͨ");
		System.out.println("myBeforeĿ����"
				+ joinPoint.getTarget());
		System.out.println("myBeforeǰ��֪ͨ"
				+joinPoint.getSignature().getName());
	}
	
	@AfterReturning("myPointCut()")
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("myAfterReturning����֪ͨ");
		System.out.println("myAfterReturningĿ����"
				+ joinPoint.getTarget());
		System.out.println("myAfterReturning����֪ͨ"
				+joinPoint.getSignature().getName());
	}
	
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("myAround����֪ͨ��ʼ"
				+proceedingJoinPoint.getSignature().getName());
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("myAround����֪ͨ����"
				+proceedingJoinPoint.getSignature().getName());
		return obj;
	}
	
	@AfterThrowing(value="myPointCut()", throwing = "e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
		System.out.println("myAfterThrowing�쳣֪ͨ��������"+e.getMessage());
	}
	
	@After("myPointCut()")
	public void myAfter(){
		System.out.println("myAfter�쳣֪ͨ��������");
	}

}
