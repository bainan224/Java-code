package Fourteeen;

import javax.print.attribute.standard.RequestingUserName;

public class qi {
String color;
public String getColor() {
return color;
}
public void run() {
	System.out.println("已迅雷不及掩耳之势，跑了过来！");
}
public String bark() {
	String str= color +"色"+"的狮子正在狮吼";
return str;
}
public int getweight() {
	int getweight=100;
	return getweight;

}
public static void main(String[] sa) {
qi an=new qi();
an.color="土黄色";
an.run();
an.bark();
System.out.println();
int weig =an.getweight();
System.out.println(weig);




}

}
