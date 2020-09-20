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
		System.out.println("�������أ�" + this.weight);
	}

	
	public void run() {
		super.run();
		System.out.println("����"+this.weight+"�Ĵ󿨳�����·����ʻ");
	}

}
