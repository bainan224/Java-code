package inherit;

public class CarTest {

	public static void main(String[]args) {
		
		Bus bus1=new Bus("大众",66,"新能源",247);
		bus1.print();
		bus1.run();
		
		Truck truck1=new Truck("北京现代",666,"汽油",246);
		truck1.print();
		truck1.run();
		
	}
}
