package com.fy;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args){

//		try {
//			Scanner in=new Scanner(System.in);
//			System.out.print("请输入被除数:");
//			int num1=in.nextInt();
//			System.out.print("请输入除数:");
//			int num2=in.nextInt();
//			System.out.println(String.format("%d / %d=%d", num1, num2, num1/ num2));
//			System.out.println("success！");
//		}catch (Exception e){
//			System.err.println("分母不能为0");
//			//System.out.println("分母不能为0");
//		}finally {
//			System.out.println("感谢使用本程序！");
//		}

		try{
			Scanner in=new Scanner(System.in);
			System.out.print("请输入被除数:");
			int num1=in.nextInt();
			System.out.print("请输入除数:");
			int num2=in.nextInt();
			System.out.println(String.format("%d / %d=%d", num1, num2, num1/ num2));
		} catch(InputMismatchException e){
			System.err.println("被除数和除数必须是整数。");
		} catch(ArithmeticException e){
			System.err.println("除数不能为零。");
		} catch (Exception e) {
			System.err.println("其他未知异常。");
		} finally{
			System.out.println("感谢使用本程序！");
		}
	}
}


