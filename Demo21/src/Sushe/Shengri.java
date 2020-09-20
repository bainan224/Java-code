package Sushe;

import java.util.Scanner;

public class Shengri {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入正确的生日：");
		String str = reader.next();
int month;

		int tian;
		boolean isTwoNum;
		boolean isTwoNum1;
		

		do {
			String[] strarr = str.split("/");
			isTwoNum = strarr[0].matches("\\d{2}");
			month = Integer.parseInt(strarr[0]);
			isTwoNum1 = strarr[0].matches("\\d{2}");
			tian = Integer.parseInt(strarr[0]);
			if (isTwoNum && isTwoNum1) {
				if (month <= 12 && tian <= 31) {

					break;
				}
			}
			System.out.println("输入错误,请重新输入：");
			str = reader.next();

		} while (true);

		System.out.println("输入正确！");

	}

}
