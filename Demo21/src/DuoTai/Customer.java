package DuoTai;

public class Customer {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public Customer() {
	
}
public Customer(String name) {
	this.name=name;
}
public void printTask(Printer printer) {
	System.out.println("---------------------");
	System.out.println(getName()+"正在提交打印任务");
	
	if(printer instanceof BlackWhitep) {
		BlackWhitep blackWhitep = (BlackWhitep) printer;
		blackWhitep.print();
	}else {
		System.out.println("未能提交黑白打印的任务");
	}
	if(printer instanceof Colorp) {
		Colorp colorp = (Colorp) printer;
		colorp.print();
	}else {
		System.out.println("未能提交彩印的任务");
	}
	if(printer instanceof ThreeDp) {
		ThreeDp threeDp = (ThreeDp) printer;
		threeDp.print();
	}else {
		System.out.println("未能提交3D彩印的任务");
	}
}






}
