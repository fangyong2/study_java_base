package com.pb.bird.test;

import com.pb.bird.Bird;
import com.pb.bird.impl.RocketBird;
import com.pb.bird.impl.SplitBird;

public class Test {

	public static void main(String[] args) {
		/*
		 *实例化鸟和鸟的行为的调用 
		 */
		Bird split_bird =new SplitBird();
		Bird rocket_bird=new RocketBird();
		split_bird.fly();
		split_bird.attack();
		rocket_bird.fly();
		rocket_bird.attack();
		
		split_bird.shout();
		rocket_bird.shout();

	}

}

