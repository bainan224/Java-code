package DuoTai;

public class FriendTest {

	public static void main(String[] args) {
		Friend friend1 = new ChineseFriend("����","�й�");
	    friend1.sayHello();
	    System.out.println("----------------");
	    Friend friend2 = new ForeignFriend("Denial","America");
	    friend2.sayHello();
	    Host host = new Host("����");
	    host.Serving(friend1, "����", "�˱���");	
	    host.Serving(friend2, "American English", "Piazz");
	}

}
