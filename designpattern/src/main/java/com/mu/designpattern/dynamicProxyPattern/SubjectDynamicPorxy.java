package com.mu.designpattern.dynamicProxyPattern;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicPorxy extends DynamicProxy {

	public static <T> T newProxyInstance(Subject subject){
		//活动ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//获得接口数组
		Class<?>[] classes = subject.getClass().getInterfaces();
		//获得handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}
	
}
