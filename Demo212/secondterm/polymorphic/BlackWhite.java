package polymorphic;

public class BlackWhite extends Printer{
    private String printway1;
    
	public String getPrintway() {
		return printway1;
	}

	public void setPrintway() {
		this.printway1 = printway1;
	}

	public BlackWhite() {
		
	}
	
	public BlackWhite(String type,String printway) {
		super(type);
		this.printway1=printway;
	}
	
	public void print() {
		System.out.println(this.getType()+"´òÓ¡»ú");
		System.out.println(this.printway1+"´òÓ¡");
	}
}
