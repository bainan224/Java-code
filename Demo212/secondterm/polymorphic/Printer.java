package polymorphic;

public abstract class  Printer {
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type ;
	
	public Printer() {
		
	}
	
	public Printer(String type) {
		this.type=type;
	}
	
	public  abstract void print();
		
	

}
