package DuoTai;

public class PrinterTest {

	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println("��̨��ӡ����");
		Printer printer = new BlackWhitep("�ڰ״�ӡ��");
		printer.print();
		Printer printer1 = new Colorp("��ɫ��ӡ��");
		printer1.print();
		Printer printer2 = new ThreeDp("3D��ɫ��ӡ��");
		printer2.print();
	   System.out.println("-------------------");
		System.out.println("�ͻ���");
	    Customer customer = new Customer("����");
	    customer.printTask(printer);
	    customer.printTask(printer1);
	    customer.printTask(printer2);
	}

}
