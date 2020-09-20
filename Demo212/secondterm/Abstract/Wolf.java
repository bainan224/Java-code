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
		System.out.println("名称："+this.getName());
    	System.out.println("属性:"+this.getNature());
    	System.out.println("品种："+this.strain);
	}
	
	public void eatSomething(String food) {
		System.out.println(this.getName()+"喜欢吃"+food);
	}
	
	public void run() {
		System.out.println(this.getName()+"正在抓羊");
	}

}
