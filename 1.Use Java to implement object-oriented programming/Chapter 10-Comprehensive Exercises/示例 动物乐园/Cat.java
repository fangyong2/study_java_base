package cn.jbit;

/**
 * 猫类，动物类的子类，实现陆生接口
 */
public class Cat extends Animal implements Terrestrial {
	private int legNum = 0; // 腿的条数

	/**
	 * 构造方法 name 名字 legNum 腿的条数
	 */
	public Cat(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}

	/**
	 * 重写父类的shout()方法
	 */
	public void shout() {
		System.out.println("喵喵喵……");
	}

	/**
	 * 实现接口的getLegNum()方法     腿的条数
	 */
	public int getLegNum() {
		return legNum;
	}

}

