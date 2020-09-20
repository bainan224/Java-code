package interfac;

public  abstract class Door {
	private String brand;
		
	public Door() {
		
	}
	
	public Door(String brand) {
		super();
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract void open();
	public abstract void close();

}
