package Shixun;

import java.util.Scanner;

public class Kucun {

	public  void kucun() {
		Scanner scan= new Scanner(System.in);
		Goods goods = new Goods();
		int s = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.������");
			System.out.println("\t 2.�ѳ�����Ʒ");
			System.out.println("\t 0.�����ϼ��˵�");
			System.out.println("������������֣�");
			s = scan.nextInt();
			switch (s) {
			case 1:
				goods.goods();
				break;
			case 2:
				System.out.println("ɾ����Ʒ����");
				break;
			case 0:
				System.out.println("�����ϼ��˵�");
				break;
			default:
				System.out.println("������0-4֮�����");
			}
		} 
		while (s != 0);

	}

}
