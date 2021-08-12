package com.pb.bird.two.impl;

import com.pb.bird.two.Bird;
import com.pb.bird.two.ShoutAbility;

/**
 * 炸弹鸟
 */
public class BombBird extends Bird {

	
	public BombBird(ShoutAbility shout_Ability){
		super(shout_Ability);
	}
	/**
	 * 重写攻击方法
	 */
	public void attack() {
		System.out.println("炸弹攻击！");

	}
}