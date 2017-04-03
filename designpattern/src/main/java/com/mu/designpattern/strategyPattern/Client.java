package com.mu.designpattern.strategyPattern;

public class Client {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		String symbol = "+";
		
		System.out.println(Calculator.ADD.exec(a, b));
		
		System.out.println(Calculator.ADD);
		

		System.out.println(Calculator.ADD.getValue());
		
	}

}
