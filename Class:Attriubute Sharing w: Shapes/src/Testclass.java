public class Testclass {

	
	public static void main(String[] args) {
		Square s = new Square();
		Square s2 = new Square(3.0);
		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle(3, 2);
		Cube c = new Cube();
		Cube c2 = new Cube(3);
		Cuboid cu = new Cuboid();
		Cuboid cu2 = new Cuboid(2, 3, 4);
		
		
		System.out.println("default Rectangle");
		System.out.println(r.getArea());
		System.out.println(r.getWidth());
		System.out.println(r.getLength());
		System.out.println(r.getPerimeter());
		System.out.println("other Rectangle");
		System.out.println(r2.getArea());
		System.out.println(r2.getWidth());
		System.out.println(r2.getLength());
		System.out.println(r2.getPerimeter());
		
		System.out.println("default Square");
		System.out.println(s.getArea());
		System.out.println(s.getWidth());
		System.out.println(s.getSide());
		System.out.println(s.getPerimeter());
		System.out.println("other Square");
		System.out.println(s2.getArea());
		System.out.println(s2.getWidth());
		System.out.println(s2.getSide());
		System.out.println(s2.getPerimeter());
		
		System.out.println("default Cube");
		System.out.println(c.getSurfaceArea());
		System.out.println(c.getWidth());
		System.out.println(c.getLength());
		System.out.println(c.getPerimeter());
		System.out.println(c.getVolume());
		System.out.println("other Cube");
		System.out.println(c2.getSurfaceArea());
		System.out.println(c2.getWidth());
		System.out.println(c2.getLength());
		System.out.println(c2.getPerimeter());
		System.out.println(c2.getVolume());
		
		System.out.println("default Cuboid");
		System.out.println(cu.getSurfaceArea());
		System.out.println(cu.getWidth());
		System.out.println(cu.getLength());
		System.out.println(cu.getPerimeter());
		System.out.println(cu.getVolume());
		System.out.println("other Cuboid");
		System.out.println(cu2.getSurfaceArea());
		System.out.println(cu2.getWidth());
		System.out.println(cu2.getLength());
		System.out.println(cu2.getPerimeter());
		System.out.println(cu2.getVolume());

	}
}