package Seven;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("��ӭ����xxx����ϵͳ��");
		System.out.println("\t y:����ϵͳ");
		System.out.println("\t n:�˳�ϵͳ ");
		System.out.println("����������ָʾ��");
		String str = scan.next();
		switch (str) {
		case "y":
			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע��");
			break;
		case "n":
			System.out.println("�Ѿ��˳�ϵͳ");
			break;
		default:
			System.out.println("�������");
		}
	}
}