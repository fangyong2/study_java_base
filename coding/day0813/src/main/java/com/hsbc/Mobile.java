package com.hsbc;

//手机基类
public class Mobile {
    public String name="手机";

    //发短信
    public void sendMes(){
        System.out.println("发短信");
    }
    //打电话
    public void call(){
        System.out.println("打电话");
    }

    //私有的作用域是当前类
    private void myself(){
        System.out.println("private..........");
    }

    //包+其他包的子类
    protected void child(){
        System.out.println("protected..........");
    }

    void default1(){ System.out.println("default.........."); }
}
