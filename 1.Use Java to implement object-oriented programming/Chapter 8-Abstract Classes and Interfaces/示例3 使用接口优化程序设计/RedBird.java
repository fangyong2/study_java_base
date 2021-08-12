package com.pb.bird.two.impl;

import com.pb.bird.two.Bird;
import com.pb.bird.two.ShoutAbility;

/**
 * 红色鸟
 */
public class RedBird extends Bird {

	public RedBird(ShoutAbility shout_Ability){
		super(shout_Ability);
	}
	/**
	 * 重写攻击方法
	 */
	public void attack() {
		System.out.println("普通攻击！");

	}
}