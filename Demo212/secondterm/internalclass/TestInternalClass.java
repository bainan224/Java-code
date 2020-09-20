package internalclass;

import internalclass.External.Internal;

public class TestInternalClass {
	public static void main(String []args) {
		//局部内部类测试
		External exter = new External();
		 exter.show();
		 
		External.Internal internal =  exter. new Internal();
		 internal.print();
		 //成员内部类测试
		Internal internal2 = new External().new Internal();
		 internal2.print();
		 
		 //静态内部类测试
		 External.StaticInternalClass sic = new External.StaticInternalClass();
		 sic.print();
	}

}
