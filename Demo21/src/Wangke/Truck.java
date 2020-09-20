package Wangke;

public class Truck extends Car {
	private String weight;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Truck() {

	}

	public Truck(String brand, int person, String type, String weight) {
		super(brand, person, type);
		this.weight = weight;

	}

	public void print() {
		super.print();
		System.out.println("卡车载重：" + this.weight);
	}

	
	public void run() {
		super.run();
		System.out.println("载重"+this.weight+"的大卡车正在路上行驶");
	}

}
