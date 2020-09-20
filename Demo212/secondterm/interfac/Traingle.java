package interfac;

public class Traingle implements Shape{
	//等边三角形
	private double length;  //边长
	private double height; //高

	public void setLength(double length) {
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public  Traingle(double length,double height ) {
		this.height= height;
		this.length= length;
	}
	
	public double TraingleGirth() {
		return 3*length;
	}
	
	public double TraingleArea() {
		return (length*height)/2;
	}
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("三角形周长："+TraingleGirth());
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("三角形面积："+TraingleArea());
	}

}
