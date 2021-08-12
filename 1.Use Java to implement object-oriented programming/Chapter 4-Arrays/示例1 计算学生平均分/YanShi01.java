package com.cmcc.base;

import java.util.Scanner;
/**
 * 计算学生平均分
 */
public class YanShi01 {
	//第一个演示示例参考答案
	public static void main(String[] args) {
		int[] scores = new int[5];
		//总成绩
		float total = 0;
		//平均成绩
		float avg = 0;

		Scanner input = new Scanner(System.in);
		
		//给出提示
		System.out.println("请输入5个学生的笔试成绩：");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		//计算总成绩
		for (int j = 0; j < scores.length; j++) {
			//总成绩
			total += scores[j];
		}
		//计算平均成绩
		avg = total / scores.length;
		System.out.println("总成绩：" + total);
		System.out.println("平均分：" + avg);
	}
}
