package Wangke;

public class Employee {
  
	
	private  String  name;
	private  String  gender;
	private  int  salary;
	
	
	
	//�޲εĹ��췽��
    public  Employee() {    
    	
    }
   //�вεĹ��췽��
    public  Employee(String name,String gender,int salary) {    //�޲εĹ��췽��
    	this.name = name;
    	this.gender =gender;
    	this.salary=salary;
 
  }

    public  Employee(String name) {
 	   this.name = name;
    	   this.gender ="��";
    	   this.salary=0;
 	   }

public void printEmployee() {
	System.out.println("������"+this.name);
	System.out.println("�Ա�"+this.gender);
	System.out.println("н�ʣ�"+this.salary);
	System.out.println("--------------------");
}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if("��".equals(gender)||"Ů".equals(gender)) {
			this.gender = gender;
		}else {
			System.out.println("������Ա�ֻ��Ϊ�л�Ů,���������룺");
		}
}


	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>=2020) {
			this.salary = salary;
		}else {
			System.out.println("���빤�ʵ����Ͼ���͹��ʱ�׼");
		}
		
	}
  



}
