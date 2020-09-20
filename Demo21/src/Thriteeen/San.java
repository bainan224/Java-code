package Thriteeen;

import java.util.Scanner;

public class San {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("字符串常量");
		String str = "字符串变量的值";
		System.out.println(str);

		str = new String("这是new出来的字符串");
		System.out.println(str);

		int length = str.length();
		System.out.println("如上字符串的长度为" + length);

		Scanner scan= new Scanner(System.in);
		String password = null;
		do {
			System.out.println("请输入密码：");

			password = scan.next();

			if (password.length() < 6) {
				System.out.println("输入的密码长度不能小于6,请重新输入");
			}
			else {
				break;
			}
		} while (true);

	}
}