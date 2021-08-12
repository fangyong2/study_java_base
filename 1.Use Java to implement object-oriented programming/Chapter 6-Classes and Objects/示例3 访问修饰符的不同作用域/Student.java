package test.po;

//学生类
public class Student {
	//属性
	private String name;//姓名
	//分别设置age属性为不同访问修饰符修饰
	/*public int age; 
	int age;
	protected int age;*/
	private int age;//年龄
	private double weight;//体重
	
	//无参构造方法
	public Student() {
		//使用无参构造方法构造学员时，为其属性赋值
		this.name="无名氏";
		this.age=18;
		this.weight=50;
	}

	//构造方法重载 ：带参构造方法
	public Student(String name, int age, double weight) {
		this.name = name;
		this.weight = weight;
		if(age<18 || age>30){
			System.out.println("***输入的年龄为："+age+"，该年龄不合法，将重置!***");
			this.age=18;
		}else{
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18 || age>30){
			System.out.println("***输入的年龄为："+age+"，该年龄不合法，将重置!***");
			return;

		}
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//方法
	//分别设置study()为不同访问修饰符修饰
	//private void study(){
	//void study(){
	//protected void study(){
	public void study(){
		System.out.println(name+"说：好好学习，天天向上！");
	}
}
