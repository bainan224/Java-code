package inherit;

public class EmployeeTest {
	
	public static void main(String[]args) {
		
		Worker wor1=new Worker("С��","Ů",19,4000,"����������Ա",3500);
		wor1.print();
		wor1.totalSalary();
		
		Manger man1=new Manger("��Ф","��",26,5000,"����",3500,600);
		man1.print();
		man1.totalSalary();
		
	}

}
