package inherit;

public class Employee {

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String name;
	private String sex;
	private int age;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name,String sex,int age,double salary) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.salary=salary;
	}
	
	
	public void print() {
		System.out.println("----------------");
		System.out.println("������"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("���䣺"+age);
		System.out.println("������н��"+salary);
		
	}
	
	public void totalSalary() {
		System.out.println("�ܹ���");
	}
}
