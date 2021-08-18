package com.fy;

class Person{
    private String name="";			//姓名
    private int age=0;				//年龄
    private String sex="男";		//性别

    //设置性别
    public void setSex(String sex) throws Exception{
        if("男".equals(sex)||"女".equals(sex))
            this.sex=sex;
        else{
            //throw new Exception("性别必须是“男”或者“女”！");
            throw new GenderException("性别必须是“男”或者“女”！");
        }
    }
}