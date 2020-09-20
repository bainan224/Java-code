package collections;

public class Student {
	private String name;
	private String sex;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name,String sex,int age) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名：" + this.name + "\t年龄：" + this.age + "\t\t性别：" + this.sex;
	}

}
