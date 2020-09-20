package interfac;

public class TestShape {
	public static void main(String []args) {
		System.out.println("------------------");
		Square square = new Square(6);
		square.area();
		square.girth();
	
	    System.out.println("------------------");
	    Traingle traingle = new Traingle(6, 8);
	    traingle.area();
	    traingle.girth();
	    
	    System.out.println("------------------");
	    Circle circle = new Circle(2);
	    circle.area();
	    circle.girth();
	}
}
