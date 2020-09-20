package generics;

import java.util.Date;

public class GenericsMethod {
	
	public static <E> E getExactOne(E[] arr,int index) {
		return arr[index];	
	}
	
	public static void  main(String[] args) {
		Date[] datearr = new Date[5];
		datearr[0] = new Date(1997,7,7);
		datearr[1] = new Date(1998,6,6);
		datearr[2] = new Date() ;
		datearr[3] = new Date(2000,9,9);
		datearr[4] = new Date(2001,2,8);
		
		GenericsMethod gm = new GenericsMethod();
		
		Date datetemp = gm.getExactOne(datearr, 2);
		System.out.println(datetemp);
		
		Integer[] intarr = new Integer[] {1,2,3,4,5};
		int inttemp = gm.getExactOne(intarr,2 );
		System.out.println(inttemp);
		
		Double[] douarr = new Double[] {1.23,2.34,3.56,4.67};
		Double doutemp = gm.getExactOne(douarr, 2);
		System.out.println(doutemp);
	}
	

}
