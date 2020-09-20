package Wangke;

public class Employee {
  
	
	private  String  name;
	private  String  gender;
	private  int  salary;
	
	
	
	//无参的构造方法
    public  Employee() {    
    	
    }
   //有参的构造方法
    public  Employee(String name,String gender,int salary) {    //无参的构造方法
    	this.name = name;
    	this.gender =gender;
    	this.salary=salary;
 
  }

    public  Employee(String name) {
 	   this.name = name;
    	   this.gender ="男";
    	   this.salary=0;
 	   }

public void printEmployee() {
	System.out.println("姓名："+this.name);
	System.out.println("性别："+this.gender);
	System.out.println("薪资："+this.salary);
	System.out.println("--------------------");
}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if("男".equals(gender)||"女".equals(gender)) {
			this.gender = gender;
		}else {
			System.out.println("输入的性别只能为男或女,请重新输入：");
		}
}


	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>=2020) {
			this.salary = salary;
		}else {
			System.out.println("输入工资低于南京最低工资标准");
		}
		
	}
  



}
