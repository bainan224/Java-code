package printer;

public class TestPrinter {
	public static void main(String []args) {
		InkBox inkbox = null;
		Paper paper = null;
		Printer printer = new Printer();
		
		 /*A4,彩色打印*/
		inkbox = new ColorInkBox();
		paper=new A4Paper();
		printer.setInkbox(inkbox);
		printer.setPaper(paper);
		printer.print("我们正走在正确的道路上！！");
	
	
	/*B5,彩色打印*/
	inkbox = new ColorInkBox();
	paper=new B5Paper();
	printer.setInkbox(inkbox);
	printer.setPaper(paper);
	printer.print("我们正走在正确的道路上！！");

   }
}
