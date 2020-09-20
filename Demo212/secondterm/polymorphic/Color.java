package polymorphic;

public class Color extends Printer{
    private String printway2;
		
	public String getPrintway2() {
		return printway2;
	}


	public void setPrintway2() {
		this.printway2 = printway2;
	}
	
	public  Color() {
		
	}
	public Color(String type,String printway2) {
		super(type);
		this.printway2=printway2;	
		}
	
	public void print() {
		System.out.println(this.getType()+"´òÓ¡»ú");
		System.out.println(this.printway2+"´òÓ¡");
	}
	
	
	

}
