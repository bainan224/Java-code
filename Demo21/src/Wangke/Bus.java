package Wangke;

public class Bus extends Car {
	private int digital;

	public int getDigital() {
		return digital;
	}

	public void setDigital(int digital) {
		this.digital = digital;
	}

	public Bus() {

	}

	public Bus(String brand, int person, String type, int digital) {
		super(brand, person, type);
		this.digital = digital;

	}

	public void print() {
		super.print();
		System.out.println( "公交牌号："+this.digital+"号");
	}

	
	public void run() {
		super.run();
		System.out.println("公交" +this.digital + "路正在马路上行驶");
	}


}
