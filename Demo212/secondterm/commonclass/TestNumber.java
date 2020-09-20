package commonclass;

import java.text.DecimalFormat;

public class TestNumber {

	public static void main(String[]args) {
		
	    Integer in1 = new Integer(100);
		System.out.println(in1);
		System.out.println(in1.MAX_VALUE);
		System.out.println(in1.SIZE);
		
		Integer in2 = new Integer("123");
		System.out.println(in2);
		
		int i1 = in1;//自动拆箱
		int i2 = new Integer(10000);
		System.out.println(i2);
		
		Integer in3 = 599;//自动装箱
		System.out.println(in3);
		System.out.println(Integer.toHexString(in3 ));
		System.out.println(Integer.toBinaryString(in3));
		
		System.out.println("------------------- ");
		 
		Double db1 = new Double(12.57900);
		System.out.println(db1);
		DecimalFormat df = new DecimalFormat("0.0000000");
		System.out.println(df.format(db1));
		
		Number num1 = new Double(12.4444);
		Number num2 = new Byte((byte)15);
		
		System.out.println(num1.intValue());
		
		System.out.println(Double.toHexString(db1));  
		
		
	}
}
