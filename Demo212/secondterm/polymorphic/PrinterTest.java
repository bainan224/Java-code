package polymorphic;

public class PrinterTest {
	public static void main(String[]args) {
		BlackWhite black = new BlackWhite("�ڰ�","�ڰ�");
		//black .print();
		Color color = new Color("��ɫ","��ɫ");
		//color.print();
		ThreeD threeD = new ThreeD("3D","��ɫ","3D");
	    //threeD.print();
	    
        System.out.println("--------------");
		
		Customer customer = new Customer("��Ф");
		
		customer.SubmitPrintWay(color);
		customer.SubmitPrintWay(threeD);
		customer.SubmitPrintWay(black);
	}
}
