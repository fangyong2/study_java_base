package com.cmcc.base;

public class YanShi01 {
	public static void main(String[ ] args) {
		int score1 = 100; //王梁的Java成绩
		int score2 = 72;  //王梁的音乐成绩
		if ( ( score1 > 90 && score2 > 80 )
			|| ( score1 == 100 && score2 > 70 ) ) {
			System.out.println("老师说:不错，奖励一个iPhone5！");
		}
	}
}
