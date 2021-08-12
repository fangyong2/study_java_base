package cn.jbit;

/**
 * 动物抽象类
 */
public abstract class Animal {
	private String name = null;// 名字

	/**
	 * 有参构造方法 name 名字
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * 获得动物名字
	 */
	public String getName() {
		return name;
	}

	/**
	 * 动物叫
	 */
	public abstract void shout();

}
