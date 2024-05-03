public class Square {
	
	private double side;
	private double area;
	private double perimeter;

	public Square(double s) {
		side = s;
		area = side*side;
		perimeter = (side*4);
	}
	
	public Square() {
		this(2);
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setLength(double l) {
		side = l;
	}
	
	public void setWidth(double w) {
		side = w;
	}
	
	public double getLength() {
		return side;
	}
	
	public double getWidth() {
		return side;
	}
	public double getSide() {
		return side;
	}

	

}
