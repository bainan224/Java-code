package Wangke;

public class Goat extends Animal{
public Goat() {
}
public Goat(String name) {
	super(name);
}

public void run() {
	System.out.println(this.getName()+"正在草原上跑");
}

public void eatsomething() {
	System.out.println(this.getName()+"正在吃草");
	
}

}
