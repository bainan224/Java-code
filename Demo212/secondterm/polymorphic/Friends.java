package polymorphic;

public abstract class Friends {
	private String name;
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public Friends() {
		
	}
	
	public Friends(String name,String country) {
		this.name=name;
		this.country=country;
	}
	
	public abstract void print();
	
	public abstract void sayHello(String word);

	protected abstract void language();

	protected abstract void food();
	

}
