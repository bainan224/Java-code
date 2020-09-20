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
	this(name,20,"未知",2020);
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
	System.out.println("员工姓名："+this.name);
	System.out.println("员工年龄："+this.age);
	System.out.println("员工性别："+this.gender);
	System.out.println("员工基本月薪："+this.salary);
	
}


}
