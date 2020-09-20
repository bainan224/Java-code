package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopMenu {
	// 创建集合对象，用于存储商品信息数据
	static ArrayList<Goods> array = new ArrayList<Goods>();

	public static void main(String[] args) {
		manageMenu();
	}
	 	// 主菜单
	static void manageMenu() {

		// 用循环完成再次回到主界面
		while (true) {
			// 用输出语句完主界面的编写
			System.out.println("---------欢迎进入方舟购物系统---------");
			System.out.println("1. 商品库存管理");
			System.out.println("2. 收银管理");
			System.out.println("3. 退出");
			System.out.println("请输入你的选择");
			// 用Scanner实现键盘录入数据
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// 用switch语句完成操作的选择
			switch (line) {

			case "1":
				GoodsManage.adminLogin(); // 管理员登录
				GoodsManage.goodsStockManage(array);
				break;

			case "2":
				GoodsManage.moneyManage(array);
				break;

			case "3":
				System.out.println("谢谢使用");
				// break;
				System.exit(0);// JVM退出
			}
		}
	}


}
