package interfac;

public class Circle implements Shape {
	private double radius; //�뾶
	
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
		System.out.println("Բ���ܳ���"+CircleGirth());
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Բ�������"+CircleArea());
	}
	
	

}
