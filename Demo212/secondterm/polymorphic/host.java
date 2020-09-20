package polymorphic;


public class host {
	private String name;

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}
		
	public host() {
		
	}
	
	public host(String name) {
		this.name=name;
		System.out.println("我是餐厅主人："+this.name);
	}
	
   /* public static Friends addFriends(String typeID) {
    		
    		if("中国".equals(typeID)) {
    			return new Chinese("老肖","中国");
    		}
    		else if("外国".equals(typeID)) {
    			return new Foreigner("Rose","美国");
    		
            }
			return addFriends(typeID);
    	
	}*/
	
	public void Serving(Friends friends) {
		if(friends instanceof Chinese) {
			Chinese chinese =(Chinese)friends;
			friends.sayHello("你好");
			friends.language();
			friends.food();
		}else if
		   (friends instanceof Foreigner) {
			Foreigner foreigner=(Foreigner)friends;
			friends.sayHello("Hello");
			friends.language();
			friends.food();
			
		}
		
	}

}
