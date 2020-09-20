package generics;

class ToyCat{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ToyCat(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "玩具"+this.name;
	}
}

class Cloth{
	public String toString() {
		// TODO Auto-generated method stub
		return "布";
	}
}

public class Box <T,M>{
	private T thing;
	private M madeof;
	
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	public M getMadeof() {
		return madeof;
	}
	public void setMadeof(M madeof) {
		this.madeof = madeof;
	}
	
	public Box (){
		
	}
	
	public Box(T thing, M madeof) {
		super();
		this.thing = thing;
		this.madeof = madeof;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "装的是"+this.thing+",是由"+this.madeof+"制成的";
	}

}
