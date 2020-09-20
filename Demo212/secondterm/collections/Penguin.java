package collections;

public class Penguin {
	private String name;
	private String sex;
	private int age;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public Penguin(String name, String sex,int age) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	@Override
	public boolean equals(Object peg) {
		// TODO Auto-generated method stub
		if (this == peg)
			return true;
		if (peg == null)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "名称："+this.name+"\t年龄："+this.age+"\t\t性别："+this.sex;
	}
	

}
