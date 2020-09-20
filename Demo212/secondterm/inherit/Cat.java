package inherit;

public class Cat extends Pet {
	
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

	public void playing() {
		// TODO Auto-generated method stub
		if(this.getHealth()>60) {
			System.out.println(this.getName()+"在玩逗猫棒游戏");
			this.setHealth(this.getHealth()-3);
			this.setLove(this.getLove()+2);
		}else {
			System.out.println(this.getName()+"在懒洋洋的睡觉");
		}
	}
	
	}
   

