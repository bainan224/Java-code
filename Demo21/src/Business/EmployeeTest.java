package Business;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee staff = new Employee("����", 24, "Ů", 4300);
		staff.printIncomeFullYear();
		Manager1 manager = new Manager1("Լ��", 43, "��", 4300, 50000, 0.4);
		manager.printIncomeFullYear();

	}

}
