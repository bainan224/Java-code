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
	System.out.println(getName()+"�����ύ��ӡ����");
	
	if(printer instanceof BlackWhitep) {
		BlackWhitep blackWhitep = (BlackWhitep) printer;
		blackWhitep.print();
	}else {
		System.out.println("δ���ύ�ڰ״�ӡ������");
	}
	if(printer instanceof Colorp) {
		Colorp colorp = (Colorp) printer;
		colorp.print();
	}else {
		System.out.println("δ���ύ��ӡ������");
	}
	if(printer instanceof ThreeDp) {
		ThreeDp threeDp = (ThreeDp) printer;
		threeDp.print();
	}else {
		System.out.println("δ���ύ3D��ӡ������");
	}
}






}
