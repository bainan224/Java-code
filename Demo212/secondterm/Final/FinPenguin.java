package Final;

public final class FinPenguin extends FinPet {
	private int degreeTolerence;
	private final String region="ÄÏ¼«";
	
	public int getDegreeTolerence() {
		return degreeTolerence;
	}
	public void setDegreeTolerence(int degreeTolerence) {
		this.degreeTolerence = degreeTolerence;
	}
	public String getRegion() {
		return region;
	}
	
	public FinPenguin() {
		
	}
	
	public FinPenguin(String name,int health,int Love,int degreeTolerence) {
		super(name,health,Love);
		this.degreeTolerence=degreeTolerence;	
	}
	
	public FinPenguin(String name) {
		super(name,70,70);
		this.degreeTolerence=-38;
	}

}
