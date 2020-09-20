package polymorphic;

public class PrinterTest {
	public static void main(String[]args) {
		BlackWhite black = new BlackWhite("ºÚ°×","ºÚ°×");
		//black .print();
		Color color = new Color("²ÊÉ«","²ÊÉ«");
		//color.print();
		ThreeD threeD = new ThreeD("3D","²ÊÉ«","3D");
	    //threeD.print();
	    
        System.out.println("--------------");
		
		Customer customer = new Customer("ÀÏÐ¤");
		
		customer.SubmitPrintWay(color);
		customer.SubmitPrintWay(threeD);
		customer.SubmitPrintWay(black);
	}
}
