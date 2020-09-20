package encolope;

public class Employee {
	
	private String name;
	private String gender;
	private int salary;
	
	public void setGender(String gender) {
		if("男".equals(gender)||"女".equals(gender)) {
			 this.gender=gender;
		}else {
			System.out.println("性别输入方式有误");
		}
	}
	
	public String getGender() {
		return this.gender;	
	}
	
	public void setSalary(int salary) {
		if(salary>=2020) {
			this.salary=salary;
		}else {
			System.out.println("薪资低于最低标准");
		}
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public Employee() {
	
	}

	public Employee(String name,String gender,int salary) {
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	
	public Employee(String name) {
		this.name=name;
		this.gender=gender;
		this.salary=0;
		
	}
	

	public void printEmpolyee() {
		System.out.println("姓名："+this.name);
		System.out.println("性别："+this.gender);
		System.out.println("薪资："+this.salary);
		System.out.println("----------------");
		
	}
	
}

