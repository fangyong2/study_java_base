package com.pb.oop;

public class Test {
	public static void main(String[] args) {
	    Host host=new Host();
	    Animal animal;
	    animal=host.donateAnimal("dog");
	    animal.cry();//狗叫
	    animal=host.donateAnimal("cat");
	    animal.cry();//猫叫
	}
}