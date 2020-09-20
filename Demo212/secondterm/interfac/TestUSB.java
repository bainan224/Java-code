package interfac;

public class TestUSB {
	public static void main(String []args) {
		USB usb1 = new Mouse();
	     System.out.println("-----------------");
		   usb1.insert();
		   usb1.start();
		   usb1.stop();
		   
		USB usb2 = new Disc();
		 System.out.println("-----------------");
		   usb2.insert();
		   usb2.start();
		   usb2.stop();
		   
		USB usb3 = new Upan();
		 System.out.println("-----------------");
		   usb3.insert();
		   usb3.start();
		   usb3.stop();
		   
		
	}

}
