package polymorphic;

public class FriendsTest {

	public static void main(String []args) {
		Chinese chinese=new Chinese("小飞侠","国籍");
		Foreigner foreigner =new Foreigner("James","美国");
		
		System.out.println("欢迎光临");
		
		host hos = new host("老肖") ;
		
		/*Friends friends1=hos.addFriends("中国");*/
		  chinese.print();
		hos.Serving(chinese);
		
		/*Friends friends2=host.addFriends("外国");*/
		  foreigner.print();
		hos.Serving(foreigner);
		
		
			
		
	}
}
