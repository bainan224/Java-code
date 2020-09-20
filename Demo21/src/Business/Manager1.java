package Business;

public class Manager1 extends Employee {
	private int allstock;// 总
	private double stock;// 股权

	public int getallstock() {
		return allstock;
	}

	public void setBonus(int allstock) {
		this.allstock = allstock;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public Manager1() {

	}

	public Manager1(String name, int age, String gender, int salary, int allstock, double stock) {
		super(name, age, gender, salary);
		this.allstock = allstock;
		this.stock = stock;

	}

	public void printIncomeFullYear() {

		super.printIncomeFullYear();
		System.out.println("经理的年薪：" + (((getallstock() * getStock()) * 12) + getSalary()));

	}

}
