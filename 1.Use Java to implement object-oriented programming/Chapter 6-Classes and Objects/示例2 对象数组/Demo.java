public class Demo {
	public static void main(String[] args) {
		//定义包含三个元素的对象数组，数据类型为Student，并使用for循环遍历输出
		//创建三个学生对象
		Student arr[]=new Student[3];
		Student stu1=new Student();
		stu1.name="张浩";
		stu1.age=20;
		stu1.weight=60;
		Student stu2=new Student();
		stu2.name="王强";
		stu2.age=22;
		stu2.weight=64;
		Student stu3=new Student();
		stu3.name="李明";
		stu3.age=19;
		stu3.weight=55;
		//将学生对象依次放进数组
		arr[0]=stu1;
		arr[1]=stu2;
		arr[2]=stu3;
		//循环输出学生对象的年龄
		for(int i=0;i<arr.length;i++){
		     System.out.println(arr[i].age);
		}



	}
}
