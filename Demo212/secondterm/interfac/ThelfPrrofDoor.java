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
		System.out.println(this.getBrand()+"������");
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"������");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"�ſ���");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+"�Ź���");
	}

	@Override
	public void takepicture() {
		// TODO Auto-generated method stub
		System.out.println("�������ˣ��Խ����գ��������");
	}

}
