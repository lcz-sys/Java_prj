package com.gdcp.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//切面类
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		check_permissions();
		
		Object obj = methodInvocation.proceed();
		
		log();
		
		return null;
	}

	public void log() {
		System.out.println("模拟记录日志");
	}

	public void check_permissions() {
		
		System.out.println("模拟检查权限");
		
	}

}
