package week4.shape2d3dapp;

public class Circle extends Shape implements Shape2D {

	int radius;
	
	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int) (Math.PI * radius * radius);
	}

	@Override
	public int getPerimeter() {
		return (int) (2 * Math.PI * radius);
	}

}
