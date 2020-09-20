package DuoTai;

public class FriendTest {

	public static void main(String[] args) {
		Friend friend1 = new ChineseFriend("无名","中国");
	    friend1.sayHello();
	    System.out.println("----------------");
	    Friend friend2 = new ForeignFriend("Denial","America");
	    friend2.sayHello();
	    Host host = new Host("芳华");
	    host.Serving(friend1, "汉语", "八宝饭");	
	    host.Serving(friend2, "American English", "Piazz");
	}

}
