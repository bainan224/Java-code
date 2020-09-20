package inherit;

public class EmployeeTest {
	
	public static void main(String[]args) {
		
		Worker wor1=new Worker("小王","女",19,4000,"行政管理人员",3500);
		wor1.print();
		wor1.totalSalary();
		
		Manger man1=new Manger("老肖","男",26,5000,"经理",3500,600);
		man1.print();
		man1.totalSalary();
		
	}

}
