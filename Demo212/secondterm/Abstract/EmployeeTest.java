package Abstract;

public class EmployeeTest {
	
	public static void main(String[]args) {
	
		Manager manager = new Manager("老肖","男",26,5000,"总经理",30000);
		manager.print();
		manager.printIncomeFullYear();
	}

}
