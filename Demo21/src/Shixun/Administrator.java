package Shixun;

import java.util.Scanner;
public class Administrator {
public void administrator() {
	Scanner scan= new Scanner(System.in);
	Scanner  reader= new Scanner(System.in);
	String username=null,password=null;
	String username1="abcd";
	String password1="123456";
	boolean flag = true;
	do {
	   System.out.println("�������û�����");
	   username=reader.next();
	   System.out.println("���������룺");
	   password = reader.next();
		   if(username.equals(username1)&& password.equals(password1)) {
		     System.out.println("����ɹ�!"); 
		     flag = false;
		   }else {
		     System.out.println("�û��������������������������:");
		   }
		        
}while(flag);
	
	
	int secondNum = 1;
    Customs cus = new Customs();
	Kucun ku = new Kucun();
    Income income = new Income();
	do {
    System.out.println("----------------");
	System.out.println("\t 1.�ͻ���Ϣ����");
    System.out.println("\t 2.�ֿ���Ʒ����");
    System.out.println("\t 3.������ϸ");
    System.out.println("\t 3.�������");
    System.out.println("\t 4.");
    System.out.println("\t 0.�����ϼ��˵�");
    System.out.println("������������֣�");
    secondNum =scan.nextInt();
    switch (secondNum) {
case 1:
	cus.customs();
	break;
case 2:
     ku.kucun();
break;
case 3:
     income.income();
break;
case 4:
	System.out.println();
break;
case 0:
	System.out.println("�����ϼ��˵�");
	break;
default:
	System.out.println("������0-4֮�����");
}
} while (secondNum != 0);
	}


}







