package Business;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee staff = new Employee("÷ìÀö", 24, "Å®", 4300);
		staff.printIncomeFullYear();
		Manager1 manager = new Manager1("Ô¼º²", 43, "ÄÐ", 4300, 50000, 0.4);
		manager.printIncomeFullYear();

	}

}
