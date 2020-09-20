package interfac;

public class Square implements Shape {
	
	private double length; //边长
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public Square(double length) {
		this.length= length;
	}
	
    public double  SquareArea() {
      return length*length;
	}
    
    public double SquareGirth() {
    	return 4*length;
    }
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("正方形周长："+this.SquareGirth());
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("正方形面积："+this.SquareArea());
	}


}
