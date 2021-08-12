package com.pb.oop;

//主人类
public class Host {
	public void letCry(Animal animal) {
	    animal.cry();//调用动物叫的方法
	}
	//赠送动物，该方法返回父类类型
	public Animal donateAnimal(String type) {
	    Animal animal;
	    if(type.equals("dog")){
	      animal=new Dog();
	    }
	    else if(type.equals("cat")){
	      animal=new Cat();
	    }
	    else{
	      animal=new Duck();
	    }
	    return animal;
	}
}
//Dog子类继承Animal父类
class Dog extends Animal{
	public void cry() {
		System.out.println("狗狗叫");
	}
}
//Cat子类继承Animal父类
class Cat extends Animal{
	public void cry() {
		System.out.println("猫猫叫");
	}
}
//Duck子类继承Animal父类
class Duck extends Animal{
	public void cry() {
		System.out.println("鸭鸭叫");
	}
}
