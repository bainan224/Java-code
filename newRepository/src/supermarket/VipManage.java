package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class VipManage {

	// 会员库存管理
	static void vipManage(ArrayList<Vip> vipArray) {

		while (true) {
			// 用输出语句完主界面的编写
			System.out.println("---------欢迎进入方舟购物系统---------");
			System.out.println("1. 查看会员");
			System.out.println("2. 新增会员");
			System.out.println("3. 修改会员");
			System.out.println("4. 删除会员");
			System.out.println("5. 返回");
			System.out.println("请输入你的选择");
			// 用Scanner实现键盘录入数据
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// 用switch语句完成操作的选择
			switch (line) {

			case "1":
				searchVip(vipArray);
				break;

			case "2":
				addVip(vipArray);
				break;

			case "3":
				updateVip(vipArray);
				break;

			case "4":
				deleteVip(vipArray);
				break;

			case "5":
				ShopMenu.manageMenu(); // 返回到主菜单
			}
		}

	}

	// 查询会员
	public static void searchVip(ArrayList<Vip> vipArray) {

		// 如果会员集合为空
		if (vipArray.isEmpty()) {
			System.out.println("暂无会员, 请先添加会员!");
			vipManage(vipArray);
		}

		// 展示会员
		showVip(vipArray);
	}

	// 展示会员
	public static void showVip(ArrayList<Vip> vipArray) {

		// 显示表头信息
		System.out.println("会员编号\t\t会员名称\t会员余额\t会员积分");

		// 将集合中数据取出按照对应格式显示会员信息
		for (int i = 0; i < vipArray.size(); i++) {
			Vip v = vipArray.get(i);
			System.out.println(v.getVid() + "\t" + v.getVipName() + "\t" + v.getVipMoney() + "\t\t" + v.getVipIntegral());
		}
	}

	// 新增会员
	private static void addVip(ArrayList<Vip> vipArray) {

		// 键盘录入会员对象所需要的数据，显示提示信息，提示要输入何种信息
		Scanner input = new Scanner(System.in);

		// 为了vid在while循环外面被访问到，我们就把他定义在了循环外；
		String vid;

		// 为了让程序回到这里，我们使用循环实现
		while (true) {
			System.out.println("请输入会员编号(建议最多9位)");
			vid = input.nextLine();
			boolean flag = isUsed(vipArray, vid);
			if (flag) {
				System.out.println("你输入的会员编号已经被使用，请重新输入!");
			} else {
				break;
			}
		}

		System.out.println("请输入会员名称");
		String vipName = input.nextLine();
		System.out.println("请输入会员余额");
		String vipMoney = input.nextLine();
		System.out.println("请输入会员积分");
		int vipIntegral = input.nextInt();

		// 创建会员对象，把键盘录入的数据赋值给会员对象的成员变量
		Vip v = new Vip();
		v.setVid(vid);
		v.setVipName(vipName);
		v.setVipMoney(vipMoney);
		v.setVipIntegral(vipIntegral);
		// 把会员对象添加到集合中
		vipArray.add(v);
		System.out.println("添加会员成功");
	}

	// 修改会员
	private static void updateVip(ArrayList<Vip> vipArray) {
		// 键盘录入要修改的会员编号，显示提示信息
		Scanner input = new Scanner(System.in);

		System.out.println("请输入你要修改的会员编号");
		String vid = input.nextLine();
		int flag = -1;
		flag = getFlag(vipArray, vid); // 获取会员编号的索引
		if (flag == -1) {

			System.out.println("该信息不存在，无法修改，请重新输入！");
			return;

		} else {

			// 键盘录入要修改的会员信息
			System.out.println("请输入会员的新名称：");
			String vipName = input.nextLine();
			System.out.println("请输入会员的新会员余额：");
			String vipMoney = input.nextLine();
			System.out.println("请输入会员的新积分：");
			int vipIntegral = input.nextInt();

			// 创建会员对象
			Vip v = new Vip();
			v.setVid(vid);
			v.setVipName(vipName);
			v.setVipMoney(vipMoney);
			v.setVipIntegral(vipIntegral);

			// 根据上面的索引值修改对应的会员信息
			vipArray.set(flag, v);

		}

		// 给出修改成功提示
		System.out.println("修改会员信息成功");
	}

	// 删除会员
	private static void deleteVip(ArrayList<Vip> vipArray) {
		// 键盘录入要删除的会员编号，显示提示信息。
		Scanner input = new Scanner(System.in);

		System.out.println("请输入你要删除的会员编号：");
		String vid = input.nextLine();
		// 再删除/修改会员操作前，对会员是否存在进行判断
		// 如果不存在，显示提示信息
		// 如在存在，进行遍历集合操作将对应会员对象从集合中删除
		int index = -1;
		index = getFlag(vipArray, vid); // 获得索引
		if (index == -1) {
			System.out.println("该会员信息不存在，请重新输入");
		} else {
			vipArray.remove(index);
			// 给出删除成功提示
			System.out.println("删除会员成功");
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

	// 判断会员编号是否被使用
	public static boolean isUsed(ArrayList<Vip> vipArray, String vid) {
		// 如果与集合中的某一个会员编号相同，返回true；如果都不相同，返回false
		boolean flag = false;
		for (int i = 0; i < vipArray.size(); i++) {
			Vip s = vipArray.get(i);
			if (s.getVid().equals(vid)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// 返回一个会员编号
	public static int getFlag(ArrayList<Vip> vipArray, String vid) {
		int flag = -1;
		for (int j = 0; j < vipArray.size(); j++) {

			Vip g1 = vipArray.get(j);
			if (g1.getVid().equals(vid)) {

				flag = j;
				break;
			}

		}
		return flag;
	}

}
