package com.gdcp.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//������
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		check_permissions();
		
		Object obj = methodInvocation.proceed();
		
		log();
		
		return null;
	}

	public void log() {
		System.out.println("ģ���¼��־");
	}

	public void check_permissions() {
		
		System.out.println("ģ����Ȩ��");
		
	}

}
