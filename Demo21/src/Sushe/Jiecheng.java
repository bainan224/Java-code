package Sushe;

public class Jiecheng {

	public static void main(String[] args) {
	int a=1;
	
	for(int i=1;i<=10;i++) {
	a=1;
	for(int j=1;j<=i;j++) {
	a=a*j;
	}
	if(a>400) {
	System.out.println("��С��Ȼ��Ϊ��"+a);
	break;
	}System.out.println("��ǰ��iΪ��"+i);
  }       
	
	
	}
}
