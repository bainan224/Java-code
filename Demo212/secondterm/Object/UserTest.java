package Object;

public class UserTest {
	public static void main(String[]args) {
		
		User user1 = new User("С����","18014263405");
		System.out.println(user1.toString());
		
		User user2 = new User("����","18014263405");
		System.out.println(user2);
		
		if(user1.equals(user2)) {
			System.out.println("��ͬһ�û�");
		}else {
			System.out.println("����ͬһ�û�");
		}
	}

}
