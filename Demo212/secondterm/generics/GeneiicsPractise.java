package generics;

public class GeneiicsPractise {
	
	public static<E> E getTheSecondLastElement(E[] arr) {
		return arr[arr.length-2];
	}
	
	public static void main(String [] args) {
		Integer[] intarr = new Integer[] {1,2,3,4,5};
		GeneiicsPractise gp = new GeneiicsPractise();
		int inttemp = gp.getTheSecondLastElement(intarr);
		System.out.println("调用倒数第二个数："+inttemp);
		
	}

	
	

}
