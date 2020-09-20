package DuoTai;

public class ChineseFriend extends Friend{
public ChineseFriend() {
	}
public ChineseFriend(String name,String nationality) {
	super(name,nationality);
	}

public void sayHello() {
	System.out.println(getName()+"向主人打招呼：你好，请多多关照！");
	System.out.println("我来自："+getNationality());
}

}
