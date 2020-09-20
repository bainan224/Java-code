package printer;

public class Printer {
	private InkBox inkbox= null;
	private Paper  paper =null;
	
	public void setInkbox(InkBox inkbox) {
		this.inkbox = inkbox;
	}
	
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public Printer() {
		
	}
	
	public Printer(InkBox inkbox, Paper paper) {
		super();
		this.inkbox = inkbox;
		this.paper = paper;
	}
	
	public void print(String content) {
		System.out.println("---------------------");
		System.out.println("打印机正在使用（"
	               +inkbox.getInkBox()+","
				   +paper.getPaper()+")打印"
	               +"{"+content+"}");
	}
	
}
