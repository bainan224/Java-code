package encolope;

public class Employee {
	
	private String name;
	private String gender;
	private int salary;
	
	public void setGender(String gender) {
		if("��".equals(gender)||"Ů".equals(gender)) {
			 this.gender=gender;
		}else {
			System.out.println("�Ա����뷽ʽ����");
		}
	}
	
	public String getGender() {
		return this.gender;	
	}
	
	public void setSalary(int salary) {
		if(salary>=2020) {
			this.salary=salary;
		}else {
			System.out.println("н�ʵ�����ͱ�׼");
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
		System.out.println("������"+this.name);
		System.out.println("�Ա�"+this.gender);
		System.out.println("н�ʣ�"+this.salary);
		System.out.println("----------------");
		
	}
	
}

