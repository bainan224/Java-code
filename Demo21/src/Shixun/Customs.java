package Shixun;

import java.util.Scanner;

public class Customs {
	public  void customs() {
		Scanner scan= new Scanner(System.in);
		int thirdNum = 1;
		Addcustoms add = new Addcustoms();
		Delcustoms del = new Delcustoms();
		CustomsInformation inf = new CustomsInformation();
		do {
			System.out.println("------------------");
			System.out.println("\t 1.��ѯ�ͻ���Ϣ");
			System.out.println("\t 2.���ӿͻ�");
			System.out.println("\t 3.ɾ���ͻ�");
			System.out.println("\t 0.�����ϼ��˵�");
			System.out.println("������������֣�");
			thirdNum = scan.nextInt();
			switch (thirdNum) {
			case 1:
				inf.information();
				break;
			case 2:
				add.addcustoms();
				break;
			case 3:
				del.delcustoms();
				break;
			case 0:
				System.out.println("�����ϼ��˵�");
				break;
			default:
				System.out.println("������0-4֮�����");
			}
		} 
		while (thirdNum != 0);
		}
}