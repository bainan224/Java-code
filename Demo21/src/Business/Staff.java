package Business;

public class Staff {
private String name;
private int age;
private String gender;
private int salary;

public Staff() {
	
}

public Staff(String name,int age,String gender,int salary) {
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.salary=salary;
}
public Staff(String name) {
	this(name,20,"δ֪",2020);
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public void printIncomebyMonth() {
	
	System.out.println("----------------------");
	System.out.println("Ա��������"+this.name);
	System.out.println("Ա�����䣺"+this.age);
	System.out.println("Ա���Ա�"+this.gender);
	System.out.println("Ա��������н��"+this.salary);
	
}


}
