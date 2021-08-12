//测试类
public class Test {
	public static void main(String[] args) {
//		Pet pet = new Dog();
		Pet pet=new Penguin();
		//使用instanceof判断具体宠物类型，调用特定宠物方法
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();//执行狗狗特有的方法接飞盘
		} else if (pet instanceof Penguin) {
			Penguin penguin = (Penguin) pet;
			penguin.swim();//执行企鹅特有的方法在南极游泳
		}
	}
}
