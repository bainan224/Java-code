package collections;

public class DogHashSetPrctise {
	
	private String name;
	private String strain;
	private String phoneNumber;
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public DogHashSetPrctise(String name, String strain, String phoneNumber) {
		super();
		this.name = name;
		this.strain = strain;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "主人："+this.name+"\t狗狗品种："+this.strain+"\t\t电话号码："+this.phoneNumber;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int prime=31;
		int result=17;
		result = prime*result+(this.name!=null?this.name.hashCode():0);
		result = prime*result+(this.phoneNumber!=null?this.phoneNumber.hashCode():0);
		return result;	
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof DogHashSetPrctise) {
			DogHashSetPrctise dog = (DogHashSetPrctise)obj;
			if(this.name.equals(dog.getName())&&this.phoneNumber.equals(dog.getPhoneNumber())) {
				return true;
			}else {
				return false;
			}
		}else {
		    return false;
		}
	}

}
