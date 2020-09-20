package Wangke;

public class Car {
	private String brand;
	private int person;
	private String type;

	public Car() {

	}

	public Car(String brand, int person, String type) {
		this.brand = brand;
		this.person = person;
		this.type = type;
	}

	public Car(String brand) {
		this(brand, 0, "δ֪");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void print() {
		System.out.println("--------------------");
		System.out.println("Ʒ��:" + this.brand);
		System.out.println("��������:" + this.person);
		System.out.println("��Դ����:" + this.type);

	}
public void run() {
	   //System.out.println("��������·����������");
}
}
