package Object;

public class User {
	private String name;
	private String  phoneNumber;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber() {
		this.phoneNumber = phoneNumber;
	}
	

	
	public User(){
		
	}
	
	public User(String name,String  phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof User) {
			User user = (User)obj;
			if(this.getPhoneNumber().equals(user.getPhoneNumber())) {
			return true;
		}else {
			return false;
		}
	}else {
		return false;
	}
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "客户姓名："+this.getName()+",手机号码："+this.getPhoneNumber();
	}

	

}
