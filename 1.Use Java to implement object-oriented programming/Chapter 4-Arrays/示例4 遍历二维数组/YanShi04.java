package com.cmcc.base;

public class YanShi04 {
	//第四个演示示例参考答案
	public static void main(String[] args) {
		int [][] array = new int[][]{{80,66},{70,54,98},{77,59}}; //三个班的成绩
		int total; //保存总成绩
		for(int i = 0; i < array.length; i++) {
	        String str = (i+1) + "班";
	        total = 0; //每次循环到此都将其归0
	        for(int j = 0; j < array[i].length; j++) {
	        	total += array[i][j]; //成绩叠加
	        }
	        System.out.println(str+"总成绩：" + total);
		}
	}
}
