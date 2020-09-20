package interfac;

public class angle implements Picture {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public angle(String brand) {
		super();
		this.brand = brand;
	}
	public void show() {
		System.out.println(this.brand+"正在显示中");
	}

}
