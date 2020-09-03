package com.gdcp.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.gdcp.aspect.MyAspect;

public class JdkProxy implements InvocationHandler {

	//����Ŀ����ӿ�
	private UserDao userDao;
	
	//����������
	public Object createProxy(UserDao userDao){
		this.userDao = userDao;
		//�������
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		//������ʵ�ֵ����нӿ�
		Class<?>[] clazz = userDao.getClass().getInterfaces();
		//ʹ�ô����࣬������ǿ�����ص��Ǵ����Ķ���
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
