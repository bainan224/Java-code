package Final;

public final class RentedBus extends MotoVehicle {
	
	private int seats;
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public RentedBus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RentedBus(String brand,int seats) {
		super(brand);
		this.seats=seats;
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public int calcRent(int days) {
		// TODO Auto-generated method stub
		int rentfee=0;
		if (this.seats<=16) {
			rentfee=days*800;
		}else {
			rentfee=days*1500;
		}
		return rentfee;
	}

}
