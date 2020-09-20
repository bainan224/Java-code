package Object;

public class UserTest {
	public static void main(String[]args) {
		
		User user1 = new User("小飞侠","18014263405");
		System.out.println(user1.toString());
		
		User user2 = new User("绿绿","18014263405");
		System.out.println(user2);
		
		if(user1.equals(user2)) {
			System.out.println("是同一用户");
		}else {
			System.out.println("不是同一用户");
		}
	}

}
