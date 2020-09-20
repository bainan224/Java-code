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
    	System.out.println("名称："+this.getName());
    	System.out.println("属性:"+this.getNature());
    	System.out.println("品种："+this.strain);
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"在玩游戏");
	}

	public void eatSomething(String food) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"喜欢吃"+food);
	}


}
