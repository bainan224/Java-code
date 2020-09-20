package interfac;

public class TestThelfPrrofDoor {
	private static final String ThelfProotFinger = null;

	public static void main(String []args) {
		/*ThelfPrrofDoor tpf = new ThelfPrrofDoor("房间");
	    tpf.close();
		tpf.open();
		
		tpf.openlock();
		tpf.lockup();
		
		tpf.takepicture();
		
		SelfProofFingerprintDoor sel = new SelfProofFingerprintDoor("盼盼  ");
		sel.openByFingerprtint();
		sel.openlock();
		
		Bell bell1 = new SelfProofFingerprintDoor("现代");
		bell1.takepicture();*/
		
		DoorFingerPrint dfp = new SelfProofFingerprintDoor("现代");
		System.out.println(dfp.standard);
		//dfp.standard="类标";//final的属性，为常量，除定义处，其他地方不能赋值
		System.out.println(DoorFingerPrint.standard);//是static属性，直接可以通过接口名，属性来访问
	}
}
