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
		System.out.println("�����ڸ��ٹ�·����ʻ");
	}
	
	public void print() {
		System.out.println("-----------------");
		System.out.println("Ʒ�ƣ�"+this.brand);
		System.out.println("����������"+this.people);
		System.out.println("��Դ����:"+this.type);
		
	}

	
}
