package com.fy;

public class GenderException extends Exception{
	//自定义异常
	//构造方法
	public GenderException(String message) {
		super(message);
		System.out.println(123);
	}
}
