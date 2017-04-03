package com.mu.designpattern.factoryMethodModel;

//具体工具类
public class ConcteteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try{
			product = (Product)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			//异常处理
		}
		
		return (T)product;
	}

}
