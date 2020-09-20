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
		System.out.println("�˿�������"+this.name);
	}
	
	
	public void SubmitPrintWay(Printer printer) {
		if(printer instanceof BlackWhite) {
			BlackWhite black=(BlackWhite)printer;
			System.out.println("-------------------------");
			System.out.println("�ڰ״�ӡ����ӡ����:");
			printer.print();
			
		}else if(printer instanceof Color) {
			Color color =(Color)printer;
			System.out.println("-------------------------");
			System.out.println("��ɫ��ӡ����ӡ����:");
			printer.print();
		}else if(printer instanceof ThreeD) {
			ThreeD threeD =(ThreeD)printer;
			System.out.println("-------------------------");
			System.out.println("3D��ӡ����ӡ����:");
			printer.print();
		}
		
	}

}
