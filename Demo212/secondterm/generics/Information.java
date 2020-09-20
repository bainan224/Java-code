package generics;

public class Information <I>{
	private I Info;

	public I getInfo() {
		return Info;
	}

	public void setInfo(I info) {
		Info = info;
	}
	
	public Information() {
		
	}

	public Information(I info) {
		super();
		Info = info;
	}
   
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "¥Ú”°–≈œ¢£∫"+this.getInfo();
	}
	

}
