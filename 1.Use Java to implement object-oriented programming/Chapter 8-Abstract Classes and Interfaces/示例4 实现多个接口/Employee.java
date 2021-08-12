//员工类
public class Employee extends Person implements Programme, Melodize{
	public Employee(String name){
		this.name=name;
	}
	public Employee(){
	}
	public void programming(){
		System.out.println("正在编程......");
	}
	
	public void melodizing(){
		System.out.println("正在作曲......");
	}
}
