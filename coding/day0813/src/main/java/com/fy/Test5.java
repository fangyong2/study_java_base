package com.fy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args){
		try {
			divide();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("感谢使用本程序！");
		}
	}

	//通过throws声明抛出异常
	public static void divide() throws Exception{
		throw new GenderException("自定义异常！！！！");
	}
}


