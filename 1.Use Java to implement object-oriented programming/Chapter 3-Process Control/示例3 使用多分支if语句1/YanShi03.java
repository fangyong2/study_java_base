package com.cmcc.base;

public class YanShi03 {
    public static void main(String[] args) {
        int score = 70;    //考试成绩
        if ( score >= 90 ) {    
            System.out.println("优秀");
        } else if (score >= 80 ) {    
            System.out.println("良好");
        } else if (score >= 60 ) {    
            System.out.println("中等");
        } else {    
            System.out.println("差");
        }
    }
}
