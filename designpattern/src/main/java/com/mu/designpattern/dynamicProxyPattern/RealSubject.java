package com.mu.designpattern.dynamicProxyPattern;

public class RealSubject implements Subject {

	public void doSomething(String str) {
		System.out.println("do something!--->" + str);
	}

}
