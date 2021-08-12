package com.pb.bird.two.impl;

import com.pb.bird.two.Bird;
import com.pb.bird.two.ShoutAbility;
/**
 * 分裂鸟
 */
public class SplitBird extends Bird {

	public SplitBird(ShoutAbility shout_Ability){
		super(shout_Ability);
	}
	
	/**
	 * 重写攻击方法
	 */
	public void attack() {
		System.out.println("分裂攻击！");
	}
}

