package DuoTai;

public class ForeignFriend extends Friend {
public ForeignFriend() {
	}
public ForeignFriend(String name,String nationality) {
	super(name,nationality);
}

public void sayHello() {
	System.out.println(getName()+"向主人打招呼：Hello,next to meet you!");
	System.out.println("I come from "+getNationality());
	
}

}
