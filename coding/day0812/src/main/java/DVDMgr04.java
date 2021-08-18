import java.util.Scanner;

public class DVDMgr04 {
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
					System.out.println("---> 新增DVD\n");
					System.out.print("请输入DVD名称： ");
					String name = input.next();
					if (names[6] != null) {
						System.out.println("新增《" + name + "》失败！货架已满！");
						break;
					}

					for (int i = 0; i < names.length; i++) { // 循环遍历names数组
						if (names[i] == null) { // 查询最后一个空位置插入
							names[i] = name;
							state[i] = 1;// 置新增的DVD可借状态
							count[i] = 0;// 置借出次数为0
							date[i] = 0;
							System.out.println("新增《" + name + "》成功！");
							break;
						}
					}
					System.out.println("**************************");
					break; // 跳出switch循环
				case 2:
					/*
					 * 查看DVD
					 */
					System.out.println("---> 查看DVD\n");
					System.out.println("序号\t状 态\t名称\t\t借出日期\t借出次数");
					String message ="";
					for (int i = 0; i < names.length; i++) {
						if (names[i] == null) {
							break;
						} else if (state[i] == 0) { // state[i]为0则说明该DVD已借出
							message = (i + 1) + "\t已借出\t" + "<<"
									+ names[i] + ">>\t" + date[i] + "日\t"
									+ count[i] + "次";
							System.out.println(message);
						} else if (state[i] == 1) { // state[i]为1则说明该DVD可借
							message = (i + 1) + "\t可 借\t" + "<<"
									+ names[i] + ">>\t"  + "0日\t"
									+ count[i] + "次";
							System.out.println(message);
						}
					}
					System.out.println("**************************");
					break;
				case 3:
					/*
					 * 删除DVD
					 */
					boolean flag = false;// 标识删除成功与否
					System.out.println("---> 删除DVD\n");
					System.out.print("请输入DVD名称： ");
					name = input.next();
// 遍历数组，查找匹配信息
					for (int i = 0; i < names.length; i++) {
						// 查找到，每个元素前移一位
						if (names[i] != null && names[i].equalsIgnoreCase(name)&& state[i] == 1) { // equalsIgnoreCase方法判断字符串是否相同且忽略大小写
							int j = i;
							while (names[j + 1] != null) { // 遍历需删除的元素之后的非空元素
								names[j] = names[j + 1];
								state[j] = state[j + 1];
								date[j] = date[j + 1];
								count[j] = count[j + 1];
								j++;
							}
							// 最后一个不为空的元素置空
							names[j] = null;
							date[j] = 0;
							count[j] = 0;
							System.out.println("删除《" + name + "》成功！");
							flag = true;// 表示删除成功
							break;
						} else if (names[i] != null
								&& names[i].equalsIgnoreCase(name) && state[i] == 0) {
							System.out.println("《" + name + "》为借出状态，不能删除！");
							flag = true;
							break;
						}
					}
					if (!flag) { // 若flag不为true则说明用户输入的名称在names数组中没有匹配成功
						System.out.println("没有找到匹配信息！");
					}
					System.out.println("**************************");
					break;
				case 4:
					/*
					 * 借出DVD
					 */
					System.out.println("---> 借出DVD\n");
					System.out.print("请输入DVD名称： ");
					String want = input.next(); // 要借出的DVD名称
					for (int i = 0; i < names.length; i++) {
						if (names[i] == null) { // 无匹配
							System.out.println("没有找到匹配信息！");
							break;
						} else if (names[i].equals(want) && state[i] == 1) { // 找到匹配可借
							state[i] = 0; // 将此DVD置于借出状态
							System.out.print("请输入借出日期：");
							date[i] = input.nextInt();
							while (date[i] < 1 || date[i] > 31) { // 一个月只有31天则需要数据校验
								System.out.print("必须输入大于等于1且小于等于31的数字，请重新输入：");
								date[i] = input.nextInt();
							}
							System.out.println("借出《" + want + "》成功!");
							count[i]++;
							break;
						} else if (names[i].equals(want) && state[i] == 0) { // 找到匹配已被借出
							System.out.println("《" + want + "》已被借出！");
							break;
						}
					}
					System.out.println("**************************");
					break;
				case 5:
					/*
					 * 归还DVD并计算租金
					 */
					System.out.println("---> 归还DVD\n");
					int charge = 0;// 租金
					System.out.print("请输入DVD名称： ");
					want = input.next();
					for (int i = 0; i < names.length; i++) {
						if (names[i] == null) { // 无匹配
							System.out.println("没有找到匹配信息！");
							break;
						} else if (names[i].equals(want) && state[i] == 0) { // 找到匹配
							state[i] = 1;
							System.out.print("请输入归还日期：");

							int redate = input.nextInt();
							while (redate < date[i] || redate > 31) { // 归还日期的数据校验
								if (redate < date[i]) {
									System.out.print("归还日期不能小于借出日期,请重新输入：");
									redate = input.nextInt();
								} else {
									System.out.print("一个月只有31天，请重新输入：");
									redate = input.nextInt();
								}
							}
							charge = redate - date[i];
							System.out.println("\n归还《" + want + "》成功!");
							System.out.println("借出日期为：" + date[i] + "日");
							System.out.println("归还日期为：" + redate + "日");
							System.out.println("应付租金（元）：" + charge);
							break;
						} else if (names[i].equals(want) && state[i] == 1) { // 找到匹配但没有借出
							System.out.println("该DVD没有被借出！无法进行归还操作。");
							break;
						}
					}
					System.out.println("**************************");
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