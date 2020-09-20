package interfac;

public class Circle implements Shape {
	private double radius; //半径
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
    
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double CircleGirth() {
		return 2*Math.PI*radius;
	}
	
	public double CircleArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("圆的周长："+CircleGirth());
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("圆的面积："+CircleArea());
	}
	
	

}
