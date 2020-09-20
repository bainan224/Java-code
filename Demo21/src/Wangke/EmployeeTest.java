package Wangke;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee("张三","男",3000);
		
		emp1.printEmployee();
		
		Employee emp2=new Employee("里斯");
		emp2.setGender("女");
		emp2.setSalary(3001);
		emp2.printEmployee();
	}

}
