public class Cuboid {
	
	private double length;
	private double width;
	private double SurfaceArea;
	private double perimeter;
	private double volume;
	private double height;
	
	public Cuboid(double w, double l, double h) {
		width = w;
		length = l;
		height = h;
		SurfaceArea = (2*(width * length)+(width*height)+(length*h));
		perimeter = (width * 2) + (2* length);
		volume = (w*l*h);
	}
	
	public Cuboid() {
		this(1, 2, 3);
	}
	
	public double getSurfaceArea() {
		return SurfaceArea;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	public double getVolume()
	{
		return volume;
	}

}
