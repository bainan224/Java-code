package DuoTai;

public class ChineseFriend extends Friend{
public ChineseFriend() {
	}
public ChineseFriend(String name,String nationality) {
	super(name,nationality);
	}

public void sayHello() {
	System.out.println(getName()+"�����˴��к�����ã�������գ�");
	System.out.println("�����ԣ�"+getNationality());
}

}
