package DuoTai;

public class PrinterTest {

	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println("三台打印机：");
		Printer printer = new BlackWhitep("黑白打印机");
		printer.print();
		Printer printer1 = new Colorp("彩色打印机");
		printer1.print();
		Printer printer2 = new ThreeDp("3D彩色打印机");
		printer2.print();
	   System.out.println("-------------------");
		System.out.println("客户：");
	    Customer customer = new Customer("黛丽");
	    customer.printTask(printer);
	    customer.printTask(printer1);
	    customer.printTask(printer2);
	}

}
