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
		System.out.println("���ǲ������ˣ�"+this.name);
	}
	
   /* public static Friends addFriends(String typeID) {
    		
    		if("�й�".equals(typeID)) {
    			return new Chinese("��Ф","�й�");
    		}
    		else if("���".equals(typeID)) {
    			return new Foreigner("Rose","����");
    		
            }
			return addFriends(typeID);
    	
	}*/
	
	public void Serving(Friends friends) {
		if(friends instanceof Chinese) {
			Chinese chinese =(Chinese)friends;
			friends.sayHello("���");
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
