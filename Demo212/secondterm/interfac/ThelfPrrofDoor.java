package interfac;

public class ThelfPrrofDoor extends Door implements Lock,Bell{

	public ThelfPrrofDoor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThelfPrrofDoor(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lockup() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"上锁了");
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"锁开了");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"门开了");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"门关了");
	}

	@Override
	public void takepicture() {
		// TODO Auto-generated method stub
		System.out.println("门铃响了，对焦拍照，拍照完成");
	}

}
