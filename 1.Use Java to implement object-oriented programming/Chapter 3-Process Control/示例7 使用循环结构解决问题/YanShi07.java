package com.cmcc.base;

public class YanShi07 {
	public static void main(String[] args) {
		/**
		 * 不使用循环打印10000遍
		 */
		System.out.println("第1遍写：好好学习，天天向上！");
		System.out.println("第2遍写：好好学习，天天向上！");
		System.out.println("第3遍写：好好学习，天天向上！");
		System.out.println("第4遍写：好好学习，天天向上！");
		//省略9994个打印语句
		System.out.println("第9999遍写：好好学习，天天向上！");
		System.out.println("第10000遍写：好好学习，天天向上！");

		/**
		 * while打印10000遍
		 */
		int i = 1;
		while(i <= 10000){
			System.out.println("第" +i+ "遍写：好好学习，天天向上！");
			i++;
		}
	}
}

