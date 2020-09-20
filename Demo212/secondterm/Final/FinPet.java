package Final;

public class FinPet {
    private String name;
	private int health;
	private int love;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
    public FinPet(){
    	    	
    }
    public FinPet(String name,int health,int love){
    	this.name=name;
    	this.health=health;
    	this.love=love;
    	
    	
    }
    
    
    public FinPet(String name){
    /*  	this.name=name;
    	this.health=60;
    	this.love=60;*/
    	this(name,60,60);
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
	
    public void print(){
    	System.out.println("---------------");
    	System.out.println("名称:"+this.name);
    	System.out.println("健康指数:"+this.health);
    	System.out.println("可爱指数:"+this.love);
    
    }	
    
    public final  boolean isAnimal() {
    	return true;
  
    }
}
