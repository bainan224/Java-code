package Abstract;

public abstract class AbsPet {
	    private String name;
		private int health;
		private int love;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	    
	    public AbsPet(){
	    	    	
	    }
	    public  AbsPet(String name,int health,int love){
	    	this.name=name;
	    	this.health=health;
	    	this.love=love;
	    	
	    	
	    }
	    
	    public  AbsPet(String name){
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
	    
	    public abstract void eatSomething(String food);
	    
	    public abstract int GetLegs();
		
	    public  abstract void print();
	    	
}
