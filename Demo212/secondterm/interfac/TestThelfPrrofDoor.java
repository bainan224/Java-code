package interfac;

public class TestThelfPrrofDoor {
	private static final String ThelfProotFinger = null;

	public static void main(String []args) {
		/*ThelfPrrofDoor tpf = new ThelfPrrofDoor("����");
	    tpf.close();
		tpf.open();
		
		tpf.openlock();
		tpf.lockup();
		
		tpf.takepicture();
		
		SelfProofFingerprintDoor sel = new SelfProofFingerprintDoor("����  ");
		sel.openByFingerprtint();
		sel.openlock();
		
		Bell bell1 = new SelfProofFingerprintDoor("�ִ�");
		bell1.takepicture();*/
		
		DoorFingerPrint dfp = new SelfProofFingerprintDoor("�ִ�");
		System.out.println(dfp.standard);
		//dfp.standard="���";//final�����ԣ�Ϊ�����������崦�������ط����ܸ�ֵ
		System.out.println(DoorFingerPrint.standard);//��static���ԣ�ֱ�ӿ���ͨ���ӿ���������������
	}
}
