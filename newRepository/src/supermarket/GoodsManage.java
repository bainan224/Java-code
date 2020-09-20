package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsManage {

	// 商品库存管理
	static void goodsStockManage(ArrayList<Goods> goodsArray) {

		while (true) {
			// 用输出语句完主界面的编写
			System.out.println("---------欢迎进入方舟购物系统---------");
			System.out.println("1. 查看商品");
			System.out.println("2. 新增商品");
			System.out.println("3. 修改商品");
			System.out.println("4. 删除商品");
			System.out.println("5. 返回");
			System.out.println("请输入你的选择");
			// 用Scanner实现键盘录入数据
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// 用switch语句完成操作的选择
			switch (line) {

			case "1":
				searchGoods(goodsArray);
				break;

			case "2":
				addGoods(goodsArray);
				break;

			case "3":
				updateGoods(goodsArray);
				break;

			case "4":
				deleteGoods(goodsArray);
				break;

			case "5":
				ShopMenu.manageMenu(); // 返回到主菜单
			}
		}

	}

	// 查询商品
	public static void searchGoods(ArrayList<Goods> goodsArray) {

		// 如果商品集合为空
		if (goodsArray.isEmpty()) {
			System.out.println("暂无商品, 请先添加商品!");
			goodsStockManage(goodsArray);
		}

		// 展示商品
		showGoods(goodsArray);
	}

	// 展示商品
	public static void showGoods(ArrayList<Goods> goodsArray) {

		// 显示表头信息
		System.out.println("商品编号\t\t商品名称\t单价\t库存数量");

		// 将集合中数据取出按照对应格式显示商品信息
		for (int i = 0; i < goodsArray.size(); i++) {
			Goods g = goodsArray.get(i);
			System.out.println(g.getGid() + "\t" + g.getName() + "\t" + g.getPrice() + "\t" + g.getStock());
		}
	}

	// 新增商品
	private static void addGoods(ArrayList<Goods> goodsArray) {

		// 键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
		Scanner input = new Scanner(System.in);

		// 为了gid在while循环外面被访问到，我们就把他定义在了循环外；
		String gid;

		// 为了让程序回到这里，我们使用循环实现
		while (true) {
			System.out.println("请输入商品编号(建议最多9位)");
			gid = input.nextLine();
			boolean flag = isUsed(goodsArray, gid);
			if (flag) {
				System.out.println("你输入的商品编号已经被使用，请重新输入!");
			} else {
				break;
			}
		}

		System.out.println("请输入商品名称");
		String name = input.nextLine();
		System.out.println("请输入商品单价");
		String price = input.nextLine();
		System.out.println("请输入商品库存");
		int stock = input.nextInt();

		// 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		Goods g = new Goods();
		g.setGid(gid);
		g.setName(name);
		g.setPrice(price);
		g.setStock(stock);
		// 把学生对象添加到集合中
		goodsArray.add(g);
		System.out.println("添加商品成功");
	}

	// 修改商品
	private static void updateGoods(ArrayList<Goods> goodsArray) {
		// 键盘录入要修改的商品编号，显示提示信息
		Scanner input = new Scanner(System.in);

		System.out.println("请输入你要修改的商品编号");
		String gid = input.nextLine();
		int flag = -1;
		flag = getFlag(goodsArray, gid); // 获取商品编号的索引
		if (flag == -1) {

			System.out.println("该信息不存在，无法修改，请重新输入！");
			return;

		} else {

			// 键盘录入要修改的学生信息
			System.out.println("请输入商品的新名称：");
			String name = input.nextLine();
			System.out.println("请输入商品的新单价：");
			String price = input.nextLine();
			System.out.println("请输入商品的新库存：");
			int stock = input.nextInt();

			// 创建学生对象
			Goods g = new Goods();
			g.setGid(gid);
			g.setName(name);
			g.setPrice(price);
			g.setStock(stock);

			// 根据上面的索引值修改对应的商品信息
			goodsArray.set(flag, g);

		}

		// 给出修改成功提示
		System.out.println("修改商品信息成功");
	}

	// 删除商品
	private static void deleteGoods(ArrayList<Goods> goodsArray) {
		// 键盘录入要删除的商品编号，显示提示信息。
		Scanner input = new Scanner(System.in);

		System.out.println("请输入你要删除的商品：");
		String gid = input.nextLine();
		// 再删除/修改商品操作前，对商品是否存在进行判断
		// 如果不存在，显示提示信息
		// 如在存在，进行遍历集合操作将对应商品对象从集合中删除
		int index = -1;
		index = getFlag(goodsArray, gid); // 获得索引
		if (index == -1) {
			System.out.println("该商品信息不存在，请重新输入");
		} else {
			goodsArray.remove(index);
			// 给出删除成功提示
			System.out.println("删除商品成功");
		}

	}

	// 管理员登录
	public static void adminLogin() {

		Scanner scan = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
		String username = null, password = null;
		String username1 = "admin";
		String password1 = "123";
		boolean flag = true;
		do {
			System.out.println("请输入用户名(admin)：");
			username = reader.next();
			System.out.println("请输入密码：");
			password = reader.next();
			if (username.equals(username1) && password.equals(password1)) {
				System.out.println("登入成功!");
				flag = false;
			} else {
				System.out.println("用户名或密码输入错误，请重新输入:");
			}

		} while (flag);
	}

	// 判断商品编号是否被使用
	public static boolean isUsed(ArrayList<Goods> goodsArray, String gid) {
		// 如果与集合中的某一个商品编号相同，返回true；如果都不相同，返回false
		boolean flag = false;
		for (int i = 0; i < goodsArray.size(); i++) {
			Goods s = goodsArray.get(i);
			if (s.getGid().equals(gid)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// 返回一个商品编号
	public static int getFlag(ArrayList<Goods> goodsArray, String gid) {
		int flag = -1;
		for (int j = 0; j < goodsArray.size(); j++) {

			Goods g1 = goodsArray.get(j);
			if (g1.getGid().equals(gid)) {

				flag = j;
				break;
			}

		}
		return flag;
	}

}
