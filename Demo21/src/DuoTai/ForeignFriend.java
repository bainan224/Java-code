package DuoTai;

public class ForeignFriend extends Friend {
public ForeignFriend() {
	}
public ForeignFriend(String name,String nationality) {
	super(name,nationality);
}

public void sayHello() {
	System.out.println(getName()+"�����˴��к���Hello,next to meet you!");
	System.out.println("I come from "+getNationality());
	
}

}
