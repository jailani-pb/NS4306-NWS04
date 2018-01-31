package week4.shape2d3dapp;

public class RunProgram {

	public static void main(String[] args) {
		Shape2D[] shapes2d = new Shape2D[5];
		shapes2d[0] = new Circle("Red", 10);
		shapes2d[1] = new Circle("Blue", 20);
		shapes2d[2] = new Rectangle(0, 0, 10, 20);
		shapes2d[3] = new Square("Yellow", 20);
		shapes2d[4] = new Rectangle(50, 50, 40, 30);
		
		for(int i = 0; i < shapes2d.length; i++) {
			System.out.println("Shape2D (" + i + ")");
			System.out.println(shapes2d[i]);
			System.out.println("Area: " + shapes2d[i].getArea());
			System.out.println("Perimeter: " + shapes2d[i].getPerimeter());
		}
		
		int numberCircle = 0;
		int numberSquare = 0;
		int numberRectangle = 0;
		for(int i = 0; i < shapes2d.length; i++) {
			if(shapes2d[i] instanceof Circle) {
				numberCircle++;
			}
			if(shapes2d[i] instanceof Square) {
				numberSquare++;
			}
			if(shapes2d[i] instanceof Rectangle) {
				numberRectangle++;
			}
		}
		System.out.println("Number of Circle: " + numberCircle);
		System.out.println("Number of Square: " + numberSquare);
		System.out.println("Number of Rectangle: " + numberRectangle);
	}
	
}







