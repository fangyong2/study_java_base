//12岁，判例的性格
public class C extends A{

    @Override//注释+功能  重写
    public void dome() {
        //super.dome();
        System.out.print("我的生活我做主！！！");
    }

    /**重载，同一个类中，方法名相同参数的类型或个数不同*/
    public void add(){
        System.out.println("add.....");
    }
    /**重载*/
    public void add(String str){
        System.out.println("add....."+str);
    }
    /**重载*/
    public void add(int a,int b){
        System.out.println(a+"+"+b+"="+a+b);
    }
}
