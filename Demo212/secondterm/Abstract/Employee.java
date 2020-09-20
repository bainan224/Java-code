package Abstract;

public abstract class Employee {
	private String name;
	private String sex;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	public Employee() {
		
	}
	
	public Employee(String name,String sex,int age,double salary) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.salary=salary;
	}
	
	public abstract void print();
	
	public abstract double printIncomeFullYear();
	

}
