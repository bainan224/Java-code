package generics;

import java.util.Date;

public class GenericsMehtodGenerics<T> {
	public <E> E getExactOne(E[] arr,int index, T tmp) {
		System.out.println(tmp);
		return arr[index];	
	}
	
	public static void  main(String[] args) {
		Date[] datearr = new Date[5];
		datearr[0] = new Date(1997,7,7);
		datearr[1] = new Date(1998,6,6);
		datearr[2] = new Date() ;
		datearr[3] = new Date(2000,9,9);
		datearr[4] = new Date(2001,2,8);
		
		GenericsMehtodGenerics<String> gm = new GenericsMehtodGenerics<String>();
		
		Date datetemp = gm.getExactOne(datearr, 2,"泛型类的泛型制定，String");
		System.out.println(datetemp);
		
		Integer[] intarr = new Integer[] {1,2,3,4,5};
		int inttemp = gm.getExactOne(intarr,2 ,"第二次数字调用，仍然是只能是String");
		System.out.println(inttemp);
		
		Double[] douarr = new Double[] {1.23,2.34,3.56,4.67};
		Double doutemp = gm.getExactOne(douarr, 2,"第三次浮点型调用，仍然只能是String");
		System.out.println(doutemp);
	}
	

}
