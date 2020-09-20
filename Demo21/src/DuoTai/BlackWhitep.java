package DuoTai;

public class BlackWhitep extends Printer{
public BlackWhitep() {
	}
public BlackWhitep(String name) {
	super(name);
}

public void print() {
	System.out.println(this.getName()+"可以被使用，可出黑白纸张");
	
}


}


