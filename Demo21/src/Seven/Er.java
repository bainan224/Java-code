package Seven;

import java.util.Scanner;

public class Er {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("����������(����)��");
	    String str=scan.next();
        switch(str) {	
        case "һ":
        System.out.println("����������Σ�");
	    break;
        case "��":
	    System.out.println("������������");
	    break;
        case "��":
	    System.out.println("�����ʼǱ�һ̨");
	    break;
        default:
	    System.out.println("�´μ���Ŭ��");
	    break;
        }
        }

}
