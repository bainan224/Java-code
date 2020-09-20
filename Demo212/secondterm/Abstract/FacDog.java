package Abstract;

public class FacDog extends AbsPet{
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public FacDog(){
           
		System.out.println("子类Dog的无参构造方法");
		
	}

	public FacDog(String name,int health,int love, String strain){
		//this.name=name; //不能直接访问父类的private属性
/*		System.out.println("子类Dog的有参构造方法");
		super.setName(name);//可以通过父类的public的setter方法来访问父类的属性
		super.setHealth(health);
		super.setLove(love);
		this.strain=strain;*/
		
		super(name,health,love);//这个和上面的代码可以达到同样的效果
		this.strain=strain;	
		
	}
	
	public  void print() {
		
		System.out.println("名称:"+this.getName());
    	System.out.println("健康指数:"+this.getHealth());
    	System.out.println("可爱指数:"+this.getLove());
		System.out.println("品种："+strain);
	}
	
	public  void eatSomething(String food){
		System.out.println(this.getName()+"喜欢吃狗粮");
	}
	
	public  int GetLegs() {
		return 4;
	}

}

