package interfac;

public class SelfProofFingerprintDoor extends Door implements DoorFingerPrint,Bell {
	public  SelfProofFingerprintDoor(String brand) {
		
		super(brand);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void lockup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"������");
	}

	@Override
	public void takepicture() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"������ˣ�����");
		
	}

	@Override
	public void openByFingerprtint() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"������ȷָ�ƺ�������");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"����Կ�׺�������");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
