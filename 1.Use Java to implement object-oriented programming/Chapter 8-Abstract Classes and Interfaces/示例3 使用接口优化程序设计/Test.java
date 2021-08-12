package com.pb.bird.two.test;

import com.pb.bird.two.Bird;
import com.pb.bird.two.ShoutAbility;
import com.pb.bird.two.impl.AoShout;
import com.pb.bird.two.impl.BombBird;
import com.pb.bird.two.impl.CanNotShout;
import com.pb.bird.two.impl.FatBird;
import com.pb.bird.two.impl.RedBird;
import com.pb.bird.two.impl.RocketBird;
import com.pb.bird.two.impl.SplitBird;
import com.pb.bird.two.impl.ZhaShout;

public class Test {

	public static void main(String[] args) {
		ShoutAbility ao_shout = new AoShout();
		ShoutAbility zha_shout = new ZhaShout();
		ShoutAbility can_not_shout = new CanNotShout();
		
		Bird bomb=new BombBird(zha_shout);
		Bird fat = new FatBird(can_not_shout);
		Bird red = new RedBird(zha_shout);
                                /*Bird rocket = new RocketBird(ao_shout );
		Bird split = new SplitBird(ao_shout );*/
		Bird rocket = new RocketBird(ao_shout);
		Bird split = new SplitBird(ao_shout);
		
		System.out.print("炸弹鸟");
		bomb.fly();
		bomb.shout();
		bomb.attack();
		System.out.print("胖子鸟");
		fat.fly();
		fat.shout();
		fat.attack();
		System.out.print("红色鸟");
		red.fly();
		red.shout();
		red.attack();
		System.out.print("火箭鸟");
		rocket.fly();
		rocket.shout();
		rocket.attack();
		System.out.print("分裂鸟");
		split.fly();
		split.shout();
		split.attack();
	}

}
