package Eight;

import java.util.Scanner;

public class Ba {
	public static void main(String[] args) {
    boolean l=false;
    Scanner scan = new Scanner(System.in);
	int i=0;
    do {
    l=false;
    System.out.println("Ŀ¼��");
    System.out.println("\t 1.�ͻ���Ϣ����");
    System.out.println("\t 2.�������");
    System.out.println("\t 3.�������");
    System.out.println("\t 4.ע��");
	System.out.println("��������ţ�");
    i=scan.nextInt();
	switch(i) {
	case 1:
	System.out.println("�ͻ���Ϣ����");
	break;
	case 2:
		System.out.println("�������");
		break;
	case 3:
		System.out.println("�������");
		break;
	
	case 4:
		System.out.println("ע��");
		break;
	default:
		System.out.println("����������������룺");
	l=true;
	break;
	}
	}
   while(l==true) ;
	
	
    }
}
