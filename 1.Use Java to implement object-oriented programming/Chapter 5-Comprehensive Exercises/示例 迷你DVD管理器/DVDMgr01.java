import java.util.Scanner;

public class DVDMgr01 {
	public static void main(String[] a) {
		/*
		 * 创建数组存储DVD信息
		 */
		String[] names = new String[7]; // 存储DVD名称数组
		int[] state = new int[7]; // 存储DVD借出状态：0已借出/1可借
		int[] date = new int[7]; // 存储DVD借出日期
		int[] count = new int[7]; // 借出次数
		int choose = 1; // 判断用户是否选择退出或是非法操作，1为初始值2为退出或者非法操作
		Scanner input = new Scanner(System.in);
		/*
		 * 初始三个DVD
		 */
		names[0] = "罗马假日";
		state[0] = 0;
		date[0] = 1;
		count[0] = 15;

		names[1] = "风声鹤唳";
		state[1] = 1;
		date[1] = 1;
		count[1] = 12;

		names[2] = "浪漫满屋";
		state[2] = 1;
		date[2] = 1;
		count[2] = 30;

		do {
			/*
			 * 开始菜单
			 */
			System.out.println("欢 迎 使 用 迷 你 DVD 管 理 器");
			System.out.println("-------------------------------------");
			System.out.println("1. 新 增 DVD");
			System.out.println("2. 查 看 DVD");
			System.out.println("3. 删 除 DVD");
			System.out.println("4. 借 出 DVD");
			System.out.println("5. 归 还 DVD");
			System.out.println("6. 退 出DVD");
			System.out.print("--------------------------------------\n");
			System.out.print("请选择： ");
			int choice = input.nextInt();
			/*
			 * switch循环提供菜单选择操作
			 */
			switch (choice) {
				case 1:
					/*
					 * 新增DVD
					 */

					break; // 跳出switch循环
				case 2:
					/*
					 * 查看DVD
					 */

					break;
				case 3:
					/*
					 * 删除DVD
					 */

					break;
				case 4:
					/*
					 * 借出DVD
					 */

					break;
				case 5:
					/*
					 * 归还DVD并计算租金
					 */

					break;
				case 6:
					choose = 2; // 用户选择退出
					break;
				default:
					System.out.println("非法操作");
					choose = 2; // 用户没有输入1到6的整形数据则属于非法操作直接退出程序
					break;
			}
			if (choose != 2) {// 如果为2则是用户选择了退出或者是非法操作
				System.out.println("输入0返回 ");
				int back = input.nextInt();
				if (back != 0) {// 如果用户没选择0则为非法操作
					System.out.println("非法操作");
					choose = 2;
				}
			}
		} while (choose == 1); // 判断用户择退出还是返回
		System.out.print("谢谢使用");
	}
}