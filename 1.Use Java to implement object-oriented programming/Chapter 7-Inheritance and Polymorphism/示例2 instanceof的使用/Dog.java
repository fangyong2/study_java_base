/**
 * 狗狗类，宠物的子类
 */
public class Dog extends Pet {
	private String strain="牧羊犬";// 品种

	//无参构造方法
	public Dog() {
	}
	
	public Dog(String name, String strain) {
		super(name); //此处不能使用this.name=name;
		this.strain = strain;
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	/**
	 * 重写父类的print方法
	 */
	public void print() {
		super.print(); //调用父类的print方法
		System.out.println("我是一只 " + this.strain + "。");
	}
	
	/**
	 * 重写父类的toHospital方法
	 */
	public void toHospital() {
		this.setHealth(60);
        System.out.println("打针、吃药");
	}
	
	/**
	 * 狗特有的方法，接飞盘
	 */
	public void catchingFlyDisc(){
		System.out.println("狗狗接飞盘");
	}
}

