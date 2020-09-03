package com.gdcp.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.gdcp.aspect.MyAspect;

public class JdkProxy implements InvocationHandler {

	//声明目标类接口
	private UserDao userDao;
	
	//创建代理方法
	public Object createProxy(UserDao userDao){
		this.userDao = userDao;
		//类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		//被代理实现的所有接口
		Class<?>[] clazz = userDao.getClass().getInterfaces();
		//使用代理类，进行增强，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, clazz, this);
		
	}
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {

		MyAspect myAspect = new MyAspect();
		
		myAspect.check_Permissions();
		
		Object obj = arg1.invoke(userDao,arg2);
		
		myAspect.log();
		return obj;
	}

}
