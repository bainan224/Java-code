package polymorphic;

public class ThreeD extends Color{
	
	private String printway3;

	public String getPrintway() {
		return printway3;
	}

	public void setPrintway(String printway3) {
		this.printway3 = printway3;
	}
    
	public ThreeD() {
		
	}
	
	public ThreeD(String type,String printway2,String printway3) {
		super(type,printway2);
		this.printway3=printway3;
	}
	
	public void print() {
		System.out.println(this.getType()+"´òÓ¡»ú");
		System.out.println(this.printway3+"´òÓ¡");
	}

}
