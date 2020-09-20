package Final;
public abstract class MotoVehicle {
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	private String brand;
	
	public MotoVehicle() {
		
	}
	
	public MotoVehicle(String brand) {
		super();
		this.brand=brand;
	}
	
	public abstract int calcRent(int days);
	

}
