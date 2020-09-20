package interfac;

public class UDisk implements USBInterface{
     private String brand;
     
	public UDisk(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("USB接口数据正在发送中.....");
	}
	
	

}
