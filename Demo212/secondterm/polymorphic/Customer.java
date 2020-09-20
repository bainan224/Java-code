package polymorphic;

public class Customer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Customer() {
		
	}
	
	public Customer(String name) {
		this.name=name;
		System.out.println("顾客姓名："+this.name);
	}
	
	
	public void SubmitPrintWay(Printer printer) {
		if(printer instanceof BlackWhite) {
			BlackWhite black=(BlackWhite)printer;
			System.out.println("-------------------------");
			System.out.println("黑白打印机打印方法:");
			printer.print();
			
		}else if(printer instanceof Color) {
			Color color =(Color)printer;
			System.out.println("-------------------------");
			System.out.println("彩色打印机打印方法:");
			printer.print();
		}else if(printer instanceof ThreeD) {
			ThreeD threeD =(ThreeD)printer;
			System.out.println("-------------------------");
			System.out.println("3D打印机打印方法:");
			printer.print();
		}
		
	}

}
