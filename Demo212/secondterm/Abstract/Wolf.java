package Abstract;

public class Wolf extends Animals{
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public Wolf() {
		
	}
	
	public Wolf(String name,String nature,String strain) {
		super(name,nature);
		this.strain=strain;
	}
	
	public void print() {
		System.out.println("-----------------");
		System.out.println("���ƣ�"+this.getName());
    	System.out.println("����:"+this.getNature());
    	System.out.println("Ʒ�֣�"+this.strain);
	}
	
	public void eatSomething(String food) {
		System.out.println(this.getName()+"ϲ����"+food);
	}
	
	public void run() {
		System.out.println(this.getName()+"����ץ��");
	}

}
