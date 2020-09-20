package inherit;

public class Truck extends Car {
	
	private int heavy;

	public int getHeavy() {
		return heavy;
	}

	public void setHeavy(int heavy) {
		this.heavy = heavy;
	}
	
	public Truck() {
		
	}

	public Truck(String brand,int people,String type,int heavy) {
		super(brand,people,type);
		this.heavy=heavy;
		
    }
	
	public void print() {
		super.print();
		System.out.println("����������Ϊ��"+heavy);
		
	}
	
	public void run() {
		System.out.println("������������"+heavy+"�����");
	}
	
     	
}
