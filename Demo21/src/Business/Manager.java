package Business;

import javax.swing.text.Position;

public class Manager extends AdministrativeAgent {
private int allstock;//总
private double stock;//股权
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

public Manager() {
	
}

public Manager(String name,int age,String gender,int salary,String position,Integer allowance,int allstock,double stock) {
	super(name,age,gender,salary,position,allowance);
	this.allstock=allstock;
	this.stock=stock;

}

public void printIncomeFullYear() {
	
	super.printIncomebyMonth();
	System.out.println("经理的月薪："+((getallstock()*getStock())+getAllowance()+getSalary()));

}






}
