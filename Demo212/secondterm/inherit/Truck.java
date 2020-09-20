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
		System.out.println("卡车载重量为："+heavy);
		
	}
	
	public void run() {
		System.out.println("卡车正在运输"+heavy+"斤货物");
	}
	
     	
}
