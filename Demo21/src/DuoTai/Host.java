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
	System.out.println("���˵�������"+getName());
    System.out.println("----------------");
    friend.sayHello();
    System.out.println("��ӭ����!");
    System.out.println(getName()+"˵���ҽ�Ϊ���ṩ���·���");
    System.out.println("���ȣ��ҽ�Ϊ���ṩ"+language+"����");
    System.out.println("֮���ҽ�Ϊ���ṩ"+food+"����");
}

}
