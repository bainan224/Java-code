package polymorphic;

public class FriendsTest {

	public static void main(String []args) {
		Chinese chinese=new Chinese("С����","����");
		Foreigner foreigner =new Foreigner("James","����");
		
		System.out.println("��ӭ����");
		
		host hos = new host("��Ф") ;
		
		/*Friends friends1=hos.addFriends("�й�");*/
		  chinese.print();
		hos.Serving(chinese);
		
		/*Friends friends2=host.addFriends("���");*/
		  foreigner.print();
		hos.Serving(foreigner);
		
		
			
		
	}
}
