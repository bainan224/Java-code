package collections;

public class Dog implements Comparable<Dog> {
	private String name;//作为主人的名字
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
		return "名称："+this.name+"\t年龄："+this.age+"\t\t品种："+this.strain;
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
		//这里面使用age来作为TreeSet排序及判断是否是同一对象的依据，和上面的equals的判断原则不一样，这种做法不推荐，仅为展示而如此编码
		// TODO Auto-generated method stub
		if(this.age<o.getAge()) {
			return -1; //降序
		}
		else if(this.age>o.getAge()){
			return 1; //升序
		}
		else {
		return 0;
		}
	}

}
