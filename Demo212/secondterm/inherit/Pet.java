package inherit;

public class Pet extends Object{
    private String name;
	private int health;
	private int love;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
    public Pet(){
    	    	
    }
    public Pet(String name,int health,int love){
    	this.name=name;
    	this.health=health;
    	this.love=love;
    	
    	
    }
    
    
    public Pet(String name){
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
    	System.out.println("����:"+this.name);
    	System.out.println("����ָ��:"+this.health);
    	System.out.println("�ɰ�ָ��:"+this.love);
    }
    
    public void eatSomething(String food) {
    	
    }
}