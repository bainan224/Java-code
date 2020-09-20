package inherit;

public class Car {
	
	private String brand;
	private int people;
	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	private String type;
	
	public Car() {
      
	}
	
	public Car(String brand,int people,String type) {
		this.brand=brand;
		this.people=people;
		this.type=type;
		
	}
	
	public void run() {
		System.out.println("车正在高速公路上行驶");
	}
	
	public void print() {
		System.out.println("-----------------");
		System.out.println("品牌："+this.brand);
		System.out.println("乘坐人数："+this.people);
		System.out.println("能源类型:"+this.type);
		
	}

	
}
