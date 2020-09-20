package collections;

public class Dog implements Comparable<Dog> {
	private String name;//��Ϊ���˵�����
	private String strain;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Dog(String name, String strain, int age) {
		super();
		this.name = name;
		this.strain = strain;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���ƣ�"+this.name+"\t���䣺"+this.age+"\t\tƷ�֣�"+this.strain;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int prime=31;
		int result=17;
		result = prime*result+(this.name!=null?this.name.hashCode():0);
		result = prime*result+(this.strain!=null?this.strain.hashCode():0);
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Dog) {
			Dog dog = (Dog)obj;
			if(this.name.equals(dog.getName())&&this.strain.equals(dog.getStrain())) {
				return true;
			}else {
				return false;
			}
		}else {
		    return false;
		}
	
	}
	@Override
	public int compareTo(Dog o) {
		//������ʹ��age����ΪTreeSet�����ж��Ƿ���ͬһ��������ݣ��������equals���ж�ԭ��һ���������������Ƽ�����Ϊչʾ����˱���
		// TODO Auto-generated method stub
		if(this.age<o.getAge()) {
			return -1; //����
		}
		else if(this.age>o.getAge()){
			return 1; //����
		}
		else {
		return 0;
		}
	}

}
