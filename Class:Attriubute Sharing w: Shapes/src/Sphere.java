public class Sphere {
	
	private double radius;
	private double diameter;
	private double SurfaceArea;
	private double perimeter;
	private double volume;

	public Sphere(double r) {
		radius = r;
		diameter = radius*2;
		SurfaceArea = (4*(Math.PI *(r*r)));
		perimeter = (2*Math.PI*r);
		volume = ((4/3)*Math.PI*(r*r*r));
		
	}
	
	public Sphere() {
		this(2);
	}
	
	public double getSurfaceArea() {
		return SurfaceArea;
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
	
	public double getVolume() {
		return volume;
	}
	

}

