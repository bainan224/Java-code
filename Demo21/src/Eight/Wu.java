package Eight;


import java.util.Scanner;

public class Wu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int productNo=0;
	String str="y";
	str=scan.next();
	while(str.equals("y")) {
	System.out.println("��������Ʒ��ţ�");
	productNo=scan.nextInt();
	switch(productNo) {
	case 1:
	System.out.println("ƻ���ļ۸�Ϊ��Ԫÿ��");
	break;
	case 2:
		System.out.println("�㽶�ļ۸�Ϊ��Ԫÿ��");
		break;
	case 3:
		System.out.println("���ӵļ۸�Ϊ��Ԫÿ��");
		break;
	default:
		System.out.println("���޴˱��");
		break;
	}
	}
	}
}