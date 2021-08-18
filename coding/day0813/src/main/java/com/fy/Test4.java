package com.fy;
public class Test4{
    public static void main(String[] args){
        Person person=new Person();
        try{
            person.setSex("");
            //person.print();
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("谢谢使用本程序！！");
        }
    }
}










