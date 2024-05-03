public class Cube {
	
	private double side;
	private double SurfaceArea;
	private double perimeter;
	private double volume;
	
	public Cube(double s) {
		side = s;
		SurfaceArea = (6*(side*side));
		perimeter = (side*12);
		volume = (side*side*side);
	}
	
	public Cube() {
		this(2);
	}
	
	public double getSurfaceArea() {
		return SurfaceArea;
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
	public double getVolume() {
		return volume;
	}

}
