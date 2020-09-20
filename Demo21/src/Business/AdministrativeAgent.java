package Business;

public class AdministrativeAgent extends Staff {
private String position;
private int allowance;
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getAllowance() {
	return allowance;
}
public void setAllowance(int allowance) {
	this.allowance = allowance;
}

public AdministrativeAgent() {
	
}

public AdministrativeAgent(String name,int age,String gender,int salary,String position,int allowance) {
	super(name,age,gender,salary);
	this.allowance=allowance;
	this.position=position;
}

public void printIncomebyMonth() {
	
	super.printIncomebyMonth();
	System.out.println("职位："+this.position);
	System.out.println("行政补贴："+this.allowance);
    System.out.println("行政人员总月薪:"+(getSalary()+getAllowance()));

}

}
