package Fourteeen;

import javax.print.attribute.standard.RequestingUserName;

public class qi {
String color;
public String getColor() {
return color;
}
public void run() {
	System.out.println("��Ѹ�ײ����ڶ�֮�ƣ����˹�����");
}
public String bark() {
	String str= color +"ɫ"+"��ʨ������ʨ��";
return str;
}
public int getweight() {
	int getweight=100;
	return getweight;

}
public static void main(String[] sa) {
qi an=new qi();
an.color="����ɫ";
an.run();
an.bark();
System.out.println();
int weig =an.getweight();
System.out.println(weig);




}

}
