package inherit;

public class Bus extends Car {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
		
	public Bus() {
		
	}
	
	public Bus(String brand,int people,String type,int number) {
		super(brand,people,type);
		this.number=number;
		
	}
	
	public void print() {
		super.print();
		System.out.println(+number+"路公交");
	}

	public void run() {
		System.out.println(this.number+"路公交行驶中");
	}

}
