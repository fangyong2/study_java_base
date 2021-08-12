package com.pb.bird;

public abstract class Bird {
	/**
	 * 飞
	 */
	public void fly(){
		System.out.println("飞");
	}
	
	/**
	 * 叫
	 */
	public void shout(){
		System.out.println("叫");
	}
	public abstract void attack();//攻击
}
