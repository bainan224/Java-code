package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopMenu {
	// �������϶������ڴ洢��Ʒ��Ϣ����
	static ArrayList<Goods> array = new ArrayList<Goods>();

	public static void main(String[] args) {
		manageMenu();
	}
	 	// ���˵�
	static void manageMenu() {

		// ��ѭ������ٴλص�������
		while (true) {
			// ����������������ı�д
			System.out.println("---------��ӭ���뷽�۹���ϵͳ---------");
			System.out.println("1. ��Ʒ������");
			System.out.println("2. ��������");
			System.out.println("3. �˳�");
			System.out.println("���������ѡ��");
			// ��Scannerʵ�ּ���¼������
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// ��switch�����ɲ�����ѡ��
			switch (line) {

			case "1":
				GoodsManage.adminLogin(); // ����Ա��¼
				GoodsManage.goodsStockManage(array);
				break;

			case "2":
				GoodsManage.moneyManage(array);
				break;

			case "3":
				System.out.println("ллʹ��");
				// break;
				System.exit(0);// JVM�˳�
			}
		}
	}


}
