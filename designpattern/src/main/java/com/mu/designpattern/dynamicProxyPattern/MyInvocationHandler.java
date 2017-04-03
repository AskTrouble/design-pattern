package com.mu.designpattern.dynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	//被代理对象
	private Object target = null;
	
	public MyInvocationHandler(Object obj){
		this.target = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//执行被代理方法
		return method.invoke(this.target, args);
	}

}
