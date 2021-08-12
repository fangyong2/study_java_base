package com.cmcc.base;

import java.util.Scanner;

public class YanShi08 {
	/**
	 * 如何使用while循环
	 */
	public static void main(String[] args) {
		String answer;	//标识是否合格
		Scanner input = new Scanner(System.in);
		System.out.print("合格了吗?(y/n)：");
		answer = input.next();
		while(!"y".equals(answer)){
			System.out.println("上午阅读教材！");
			System.out.println("下午上机编程！\n");
			System.out.print("合格了吗?(y/n)：");
			answer = input.next();
		}
		System.out.println("完成学习任务！");
	}
}
