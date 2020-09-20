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
	System.out.println("最小自然数为："+a);
	break;
	}System.out.println("当前的i为："+i);
  }       
	
	
	}
}
