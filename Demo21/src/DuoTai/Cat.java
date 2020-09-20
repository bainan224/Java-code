package DuoTai;

public class Cat extends Pet{
public Cat() {
		
	}
	
	public Cat(String name,int Health,int Love) {
		super(name,Health,Love);
	}
	

	
	public void eatSomething(String food) {
		if(this.getHealth()!=100){
			
			   this.setHealth(this.getHealth()+4<=100?this.getHealth()+4:100);
			   System.out.println(this.getName()+"吃了"+food);
	    }
		else {
				  System.out.println(this.getName()+"已经饱了，稍后再喂");
			  }
	}
public void catchingFly() {
	if(this.getHealth()>60) {
		System.out.println(this.getName()+"和主人欢快的玩逗猫棒");
		this.setHealth(this.getHealth()-3);
		this.setLove(this.getLove()+2);
	}else {
		System.out.println(this.getName()+"懒洋洋的睡觉");
	}
}



}



