package inherit;

public class Dog extends Pet {
	
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public Dog(){
           
		System.out.println("子类Dog的无参构造方法");
		
	}

	public Dog(String name,int health,int love, String strain){
		//this.name=name; //不能直接访问父类的private属性
/*		System.out.println("子类Dog的有参构造方法");
		super.setName(name);//可以通过父类的public的setter方法来访问父类的属性
		super.setHealth(health);
		super.setLove(love);
		this.strain=strain;*/
		
		super(name,health,love);//这个和上面的代码可以达到同样的效果
		this.strain=strain;	
		
	}
	
	public void print() {
		super.print();
		/*System.out.println("名称:"+this.name);
    	System.out.println("健康指数:"+this.health);
    	System.out.println("可爱指数:"+this.love);*/
		System.out.println("品种："+strain);
	}
	
	public void eatSomrthing(String food) {
		System.out.println(this.getName()+"正在吃"+food);
		if(this.getHealth()!=100){
			
			   this.setHealth(this.getHealth()+3<=100?this.getHealth()+3:100);
			   System.out.println(this.getName()+"吃了"+food);
	    }
		else {
				  System.out.println(this.getName()+"已经饱了，稍后再喂");
			  }
	}
	
	public void catchingFlyDisc() {
		if(this.getHealth()>10) {
			System.out.println(this.getName()+"和主人一起玩耍");
			this.setHealth(this.getHealth()-10);
			this.setLove(this.getLove()+5);
		}else {
			System.out.println(this.getName()+"饿了,不想玩游戏，只想啃骨头");
		}
	}
	
	public int getLegs() {
		return 4;
	}
	
	public boolean equals(Object obj) {
		//比较的是this对象和obj对象是否是同一个物理实体
		if(obj instanceof Dog) {
			Dog dog=(Dog)obj;
			if(this.getName().equals(dog.getName())&&this.getStrain().equals(getStrain())) {
				return true;
			}
		}else {
			return false;
		}
		    return false;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我叫"+this.getName()+"是一条"+this.strain;
	}
		
		
}

