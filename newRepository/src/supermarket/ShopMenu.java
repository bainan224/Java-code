package supermarket;

import java.util.*;

public class ShopMenu {
	// 创建集合对象，用于存储商品信息数据
	static List<Goods> array2 = Repository.getArray(); // 商品集合
	static ArrayList<Goods> goodsArray = new ArrayList<Goods>(array2);
	static ArrayList<Bill> billArray = new ArrayList<Bill>(); // 账单集合
	static ArrayList<Vip> vipArray = new ArrayList<Vip>(); // 会员集合

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
			System.out.println("3. 会员管理");
			System.out.println("4. 退出");
			System.out.println("请输入你的选择");
			// 用Scanner实现键盘录入数据
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// 用switch语句完成操作的选择
			switch (line) {

			case "1":
				GoodsManage.adminLogin(); // 管理员登录
				GoodsManage.goodsStockManage(goodsArray);
				break;

			case "2":
				MoneyManage.CashierLogin(); // 收银员登陆
				MoneyManage.moneyManage(goodsArray, billArray,vipArray);
				break;
			case "3":
				MoneyManage.CashierLogin(); // 收银员登陆
				VipManage.vipManage(vipArray);
				break;
			case "4":
				System.out.println("谢谢使用");
				// break;
				System.exit(0);// JVM退出
			}
		}
	}


}
