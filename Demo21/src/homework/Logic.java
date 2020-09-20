package homework;

public class Logic {
	public static void main(String[] args) {
      int x=5,y=6,a=3,b=6;
	boolean bres=x>y && 2*a==b;
	//System.out.println(bres);
	
    bres=x>y || 2*a==b;
	//System.out.println(bres);
	
	boolean bnot=!true;
	System.out.println("not true is"+bnot); 
	bnot=!(x>y);
	System.out.println("5>6's not:"+bnot); 
	bnot=!(x>y || 2*a==b);
	System.out.println(bnot);
	if(bnot) {
		System.out.println("条件满足");
	}else {
		System.out.println("条件不满足");
	}
	
	
	
	
	
	
	}
}