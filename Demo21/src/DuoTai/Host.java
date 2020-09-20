package DuoTai;

public class Host {
private String name;
public Host() {
	}
public Host(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void Serving(Friend friend,String language,String food) {
	System.out.println("----------------");
	System.out.println("主人的姓名："+getName());
    System.out.println("----------------");
    friend.sayHello();
    System.out.println("欢迎光临!");
    System.out.println(getName()+"说：我将为你提供以下服务");
    System.out.println("首先，我将为你提供"+language+"服务");
    System.out.println("之后，我将为你提供"+food+"服务");
}

}
