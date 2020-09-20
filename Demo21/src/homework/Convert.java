package homework;

public class Convert {
	  public static void main(String[] args) {
      byte bNum1=-100;
	  short sNum2=500;
	  
	  int iNum3=4001;
	  
	  float fNum4=12.74f; 
	  
/*	  sNum2=bNum1;
	  iNum3=bNum1;
	  fNum4=iNum3;*/
	 sNum2=(short) (sNum2+5);
	  
	  fNum4=fNum4+5;
	  fNum4=(float) (fNum4+5.0);
	  fNum4=fNum4+5.0f;
	  
	  sNum2=(short)iNum3;
	  
	  
	  System.out.println("原来iNum3是"+
	  iNum3+",赋值给short以后的值为："+sNum2);
	  
	  
	  double dNum5=(double)iNum3/2;
       System.out.println(dNum5);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
}