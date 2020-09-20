package Abstract;

public class Sheep extends Animals {
	
	private String  strain;
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
    public Sheep() {
    	
    }
    
    public Sheep(String name,String nature,String strain) {
    	super(name,nature);
    	this.strain=strain;
    	
    }
    
    public void print() {
    	System.out.println("----------------");
    	System.out.println("���ƣ�"+this.getName());
    	System.out.println("����:"+this.getNature());
    	System.out.println("Ʒ�֣�"+this.strain);
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"������Ϸ");
	}

	public void eatSomething(String food) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"ϲ����"+food);
	}


}
