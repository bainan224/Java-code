package inherit;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Worker extends Employee{
	
	private String position;

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	private double allowance;
	
    public Worker() {
		
	}
	
	public Worker(String name,String sex,int age,double salary,String position,double allowance) {
		super(name,sex,age,salary);
		this.position=position;
		this.allowance=allowance;
	}
	
		public void print() {
			super.print();	
			System.out.println("Ա��ְλ��"+position);
			System.out.println("����������"+allowance);
		}		
		
		public void totalSalary() {
		double money1;
		money1=getSalary()+this.allowance;
		System.out.println("�ܹ���Ϊ��"+money1 );
		}
		
		
	}


