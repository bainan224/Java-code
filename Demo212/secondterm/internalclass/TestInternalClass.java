package internalclass;

import internalclass.External.Internal;

public class TestInternalClass {
	public static void main(String []args) {
		//�ֲ��ڲ������
		External exter = new External();
		 exter.show();
		 
		External.Internal internal =  exter. new Internal();
		 internal.print();
		 //��Ա�ڲ������
		Internal internal2 = new External().new Internal();
		 internal2.print();
		 
		 //��̬�ڲ������
		 External.StaticInternalClass sic = new External.StaticInternalClass();
		 sic.print();
	}

}
