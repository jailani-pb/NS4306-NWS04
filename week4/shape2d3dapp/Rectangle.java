package week4.shape2d3dapp;

public class Rectangle extends ShapeUI implements Shape2D {

	int base;
	int height;
	
	public Rectangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}

	@Override
	public int getArea() {
		return base * height;
	}

	@Override
	public int getPerimeter() {
		return (2 * base) + (2 * height);
	}

}
