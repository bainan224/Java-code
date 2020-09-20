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
		System.out.println(this.getBrand()+"锁开了");
	}

	@Override
	public void takepicture() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"检测有人，拍照");
		
	}

	@Override
	public void openByFingerprtint() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"按上正确指纹后，锁开了");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"插入钥匙后锁开了");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
