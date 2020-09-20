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
		this(brand, 0, "未知");
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
		System.out.println("品牌:" + this.brand);
		System.out.println("乘坐人数:" + this.person);
		System.out.println("能源类型:" + this.type);

	}
public void run() {
	   //System.out.println("车子在马路上跑起来了");
}
}
