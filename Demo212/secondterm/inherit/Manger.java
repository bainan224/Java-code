package inherit;

public class Manger extends Worker {
	
	private double stock;

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}
	
	public Manger() {
		
	}
	
	public Manger(String name,String sex,int age,double salary,String position,double allowance,double stock) {
	    super(name, sex, age, salary, position, allowance);
		this.stock=stock;
	}
	
	public void print() {
		super.print();
		System.out.println("股份分红为："+stock);
	}
	
	public void totalSalary() {
	    double money ;
		money=getSalary()+getAllowance()+this.stock;
		System.out.println("总工资为："+money);
	}

}
