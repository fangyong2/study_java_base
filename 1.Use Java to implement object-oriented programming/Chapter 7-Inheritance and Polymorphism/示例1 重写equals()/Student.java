//学生类
public class Student  {
	//属性
	private int sid;//学员学号
	private String name;//姓名
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
	public Student(int sid,String name, int age, double weight) {
		this.sid=sid;
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

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	//重写equals()方法，如果学员学号、姓名都相同，证明是同一个学生
	//instanceof运算符用于判断一个对象是否属于一个类
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(! (o instanceof Student)){
			return false;
		}
		Student obj=(Student)o;
		if(this.sid==obj.sid && this.name.equals(obj.name)){
			return true;
		}else{
			return false;
		}		
	}
	
	public static void main(String[] args) {
		//Student没有重写equals()时,下列两行代码结果：false；重写后，结果：true
		Student s1=new Student(1,"张三",20,55);
		Student s2=new Student(1,"张三",20,55);
		System.out.println(s1.equals(s2));
	}
}
