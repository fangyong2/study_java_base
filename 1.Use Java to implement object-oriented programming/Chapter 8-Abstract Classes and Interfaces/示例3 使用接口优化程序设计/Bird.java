package com.pb.bird.two;

public abstract class Bird {
	ShoutAbility shout_ability;
	
	public Bird(ShoutAbility shout_ability){
		this.shout_ability=shout_ability;
	}
	
	public void shout(){
		shout_ability.shout();
	}
	/**
	 * 飞
	 */
	public void fly(){
		System.out.println("飞");
	}
	
	public abstract void attack();//攻击
}
