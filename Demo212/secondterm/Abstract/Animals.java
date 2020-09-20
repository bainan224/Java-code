package Abstract;

public abstract class Animals {
	
	private String name;
	private String nature;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	
	public Animals() {
		
	}
	
	public Animals(String name,String nature) {
		this.name=name;
		this.nature=nature;	
	}
	
	public abstract void print();
	
	public abstract void run();
	
	public abstract void eatSomething(String food);
	
	

}
