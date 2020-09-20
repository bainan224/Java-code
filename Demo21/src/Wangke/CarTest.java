package Wangke;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus1=new Bus("宇通",25,"新能源",59);
		bus1.print();
		bus1.run();
	    Truck truck1=new Truck("东风",4,"柴油","3吨");
	    truck1.print();
	    truck1.run();
	}

}
