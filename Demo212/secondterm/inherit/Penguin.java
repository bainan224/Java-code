package inherit;

public class Penguin extends Pet{
	
	private String sex;

	public String getStrain() {
		return sex;
	}
	
	public void setStrain(String sex) {
		this.sex = sex;
	}
	
	public Penguin() {
		
	}
	
	public Penguin(String name,int health,int love,String sex){
		super(name,health,love);
		this.sex=sex;	
	
	}
	
	public void print() {
		super.print();
		System.out.println("性别："+sex);
	}

	public void eatSomething(String food) {
		// TODO Auto-generated method stub
		if(this.getHealth()!=100){
			   this.setHealth(this.getHealth()+5<=100?this.getHealth()+5:100);
			      System.out.println(this.getName()+"吃了"+food);
		}
		else {
				  System.out.println(this.getName()+"已经饱了，稍后再喂");
			  }
	}
	
	public void Swim() {
		if(this.getHealth()>10) {
			System.out.println(this.getName()+"在游泳");
			this.setHealth(this.getHealth()-10);
			this.setLove(this.getLove()+5);
		}else {
			System.out.println(this.getName()+"饿了,不想玩游戏，只想啃骨头");
		}
		}
	}


