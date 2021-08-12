package com.cmcc.base;

public class PB_Operator {
	public static void main(String[] args) {
		int num1 = 5; 
		int num2 = 2; 
		int yu = num1 % num2;
		int shang= num1 / num2;
		System.out.println("num1和num2求余：" + num1 + " % " + num2 + " = " + yu);
		System.out.println("num1和num2求商：" + num1 + " / " + num2 + " = " + shang);	
	
		num1++;
		num2--; 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
