package Wangke;

public class Goat extends Animal{
public Goat() {
}
public Goat(String name) {
	super(name);
}

public void run() {
	System.out.println(this.getName()+"���ڲ�ԭ����");
}

public void eatsomething() {
	System.out.println(this.getName()+"���ڳԲ�");
	
}

}
