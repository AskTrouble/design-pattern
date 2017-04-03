package com.mu.designpattern.factoryMethodModel;

//场景类
public class Client {

	public static void main(String[] args) {

		Creator creator = new ConcteteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		
		//继续业务处理
		product.method2();
		
	}

}
