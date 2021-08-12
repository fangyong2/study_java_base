/**
 * 企鹅类，宠物的子类
 */
public class Penguin extends Pet {
	private String sex="Q仔";// 性别

	//无参构造方法
	public Penguin() {
	}
	
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	/**
	 * 重写父类的print方法
	 */
	public void print() {
		super.print();
		System.out.println("性别是 " + this.sex + "。");
	}

	/**
	 * 重写父类的toHospital方法
	 */
	public void toHospital() {
        this.setHealth(70);
        System.out.println("吃药、疗养");
	}
	
	/**
	 * 企鹅特有的方法，在南极游泳
	 */
	public void swim(){
		System.out.println("企鹅在南极游泳");
	}
	
}
