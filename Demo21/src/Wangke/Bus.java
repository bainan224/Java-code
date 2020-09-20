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
		System.out.println( "�����ƺţ�"+this.digital+"��");
	}

	
	public void run() {
		super.run();
		System.out.println("����" +this.digital + "·������·����ʻ");
	}


}
