public class Circle {
	
	private double radius;
	private double diameter;
	private double area;
	private double perimeter;

	public Circle(double r) {
		radius = r;
		diameter = radius*2;
		area = (Math.PI *(r*r));
		perimeter = (2*Math.PI*r);
	}
	
	public Circle() {
		this(2);
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public void setDiameter(double d) {
		diameter = d;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return diameter;
	}


}

