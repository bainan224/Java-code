package Seven;

import java.util.Scanner;

public class Wu {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("ѧϰ���ڼƻ���");
		System.out.println("\t p1:��һ������");
		System.out.println("\t p2:�ܶ������������塢����");
		System.out.println("\t p3:������");
		System.out.println("��ѡ�����ڼ���");
		String str = scan.next();
		switch (str) {
		case "p1":
			System.out.println("ѧϰJava");
			break;
		case "p2":
			System.out.println("ѧϰ��ѧ��Ӣ��");
			break;
		case "p3":
			System.out.println("��Ϣ");
			break;
		default:
			System.out.println("���ڼƻ���");
			break;
		}
	}
}