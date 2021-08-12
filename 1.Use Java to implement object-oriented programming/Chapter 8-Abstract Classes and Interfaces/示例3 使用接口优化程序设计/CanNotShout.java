package com.pb.bird.two.impl;

import com.pb.bird.two.ShoutAbility;

public class CanNotShout implements ShoutAbility {

	@Override
	public void shout() {
		System.out.println("不会叫");

	}

}
