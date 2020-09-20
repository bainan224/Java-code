package printer;

public class TestPrinter {
	public static void main(String []args) {
		InkBox inkbox = null;
		Paper paper = null;
		Printer printer = new Printer();
		
		 /*A4,��ɫ��ӡ*/
		inkbox = new ColorInkBox();
		paper=new A4Paper();
		printer.setInkbox(inkbox);
		printer.setPaper(paper);
		printer.print("������������ȷ�ĵ�·�ϣ���");
	
	
	/*B5,��ɫ��ӡ*/
	inkbox = new ColorInkBox();
	paper=new B5Paper();
	printer.setInkbox(inkbox);
	printer.setPaper(paper);
	printer.print("������������ȷ�ĵ�·�ϣ���");

   }
}
