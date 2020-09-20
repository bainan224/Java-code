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
	System.out.println("ְλ��"+this.position);
	System.out.println("����������"+this.allowance);
    System.out.println("������Ա����н:"+(getSalary()+getAllowance()));

}

}
