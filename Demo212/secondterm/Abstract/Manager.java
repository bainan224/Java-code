package Abstract;

public  class Manager extends Employee {
	private String position;
	private double stock;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	
	public Manager() {
		
	}
	
	public Manager(String name,String sex,int age,double salary,String position,double stock) {
		super(name,sex,age,salary);
		this.position = position;
		this.stock = stock;	
	}
	
	public  void print() {
		System.out.println("������"+this.getName());
		System.out.println("�Ա�"+this.getSex());
		System.out.println("���䣺"+this.getAge());
		System.out.println("������н��"+this.getSalary());
		System.out.println("ְλ��"+position);
		System.out.println("�ɷݣ�"+stock);
	}
	
	public double printIncomeFullYear() {
		double totalSalary=this.getSalary()+stock*0.3;
		System.out.println(this.getName()+"����Ϊ"+totalSalary);
		return totalSalary;
	}

}
