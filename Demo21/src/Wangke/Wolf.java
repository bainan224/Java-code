package Wangke;

public class Wolf extends Animal {
public Wolf() {
	}
public Wolf(String name) {
	super(name);
	
}

public void run() {
	System.out.println(this.getName()+"正在追赶猎物");
}
public void eatsomething() {
	System.out.println(this.getName()+"正在撕咬食物");
}



}
