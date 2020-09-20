package DuoTai;

public class Colorp extends Printer{
public Colorp() {
	}
public Colorp(String name) {
	super(name);
	
}

public void print() {
	System.out.println(this.getName()+"可以被使用，可出彩印纸张");
	
	
}


}
