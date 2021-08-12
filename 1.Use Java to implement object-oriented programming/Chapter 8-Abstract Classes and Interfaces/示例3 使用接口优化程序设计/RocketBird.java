package com.pb.bird.two.impl;

import com.pb.bird.two.Bird;
import com.pb.bird.two.ShoutAbility;
/**
 * 火箭鸟
 */
public class RocketBird extends Bird {

	public RocketBird(ShoutAbility shout_Ability){
		super(shout_Ability);
	}
	
	/**
	 * 重写攻击方法
	 */
	public void attack() {
		System.out.println("加速冲撞攻击！");
	}

}
