package DuoTai;



public class Pet {
	private String name;
	private int health;
	private int love;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet() {

	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;

	}

	public Pet(String name) {

		this(name, 60, 60);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public void print() {
		
		System.out.println("名称:" + this.name);
		System.out.println("健康指数:" + this.health);
		System.out.println("可爱指数:" + this.love);
        System.out.println("---------------");
	}
	 public void eatsomething(String food) {
		 if(this.getHealth()!=100){
	 			
			   this.setHealth(this.getHealth()+4<=100?this.getHealth()+4:100);
			   System.out.println(this.getName()+"吃了"+food);
	    }
		else {
				  System.out.println(this.getName()+"已经饱了，稍后再喂");
			  }
     }
	
	
	
	
	}


