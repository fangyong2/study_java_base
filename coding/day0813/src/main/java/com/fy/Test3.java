package com.fy;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args)  {
		try{
			divide();
		} catch (Exception e) {
			System.err.println("其他未知异常。");
		} finally{
			System.out.println("感谢使用本程序！");
		}

	}

	//通过throws声明抛出异常	 
	public static void divide() throws Exception{
		Scanner in=new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1=in.nextInt();
		System.out.print("请输入除数:");
		int num2=in.nextInt();
		System.out.println(String.format("%d/%d=%d",num1,num2,num1/num2));
	}
}




