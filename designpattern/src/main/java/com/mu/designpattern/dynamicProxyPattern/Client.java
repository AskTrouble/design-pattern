package com.mu.designpattern.dynamicProxyPattern;

public class Client {

	public static void main(String[] args) {
		 
		//定义一个主题
		Subject subject = new RealSubject();
		//定义一个主题代理类
		Subject proxy = SubjectDynamicPorxy.newProxyInstance(subject);
		
		proxy.doSomething("Finsh");
		
	}

}
