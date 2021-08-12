package  com.cmcc.base;

public class PB_TypeCoercion {
	public static void main(String[] args) {
		int before = 20;				//去年市场份额
		double rise = 9.8;				//增长的份额

		int now = before + rise;		//编译出错：不能完成自动类型转换

		// int  now = before + (int)rise;	//现在的份额
		// System.out.println("现在的份额是：" + now);
	}
}
