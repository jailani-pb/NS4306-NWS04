package week3.shapeapplication;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];
		Scanner scanner = new Scanner(System.in);
		int shapePointer = 0;
		
		while(true) {
			System.out.println("Perimeter/Area Calculate");
			System.out.println("Please choose shape:");
			System.out.println("(1) Circle");
			System.out.println("(2) Square");
			System.out.println("(3) Rectangle");
			System.out.println("(4) Triangle");
			System.out.println("(5) Previous calculated shapes");
			System.out.println("(6) Quit");
			String optionInput = scanner.nextLine();
			int option = Integer.parseInt(optionInput);
			
			// Circle
			if(option == 1) {
				System.out.println("Circle:");
				System.out.println("Input radius value:");
				String radiusInput = scanner.nextLine();
				int radius = Integer.parseInt(radiusInput);
				System.out.println("Input colour value:");
				String colour = scanner.nextLine();
				
				Circle circle = new Circle(colour, radius);
				System.out.println("Circle\nColour: " 
								+ circle.colour);
				System.out.println("Area: " 
								+ circle.getArea());
				System.out.println("Perimeter: " 
								+ circle.getPerimeter());
				
				shapes[shapePointer] = circle;
				shapePointer++;
				if(shapePointer > 9) {
					shapePointer = 0;
				}
			}
			// Square
			if(option == 2) {
				System.out.println("Square:");
				System.out.println("Input side value:");
				String sideInput = scanner.nextLine();
				int side = Integer.parseInt(sideInput);
				System.out.println("Input colour value: ");
				String colour = scanner.nextLine();
				
				Square square = new Square(colour, side);
				System.out.println("Square\nColour: " 
								+ square.colour);
				System.out.println("Area: " 
								+ square.getArea());
				System.out.println("Perimeter: " 
								+ square.getPerimeter());
				shapes[shapePointer] = square;
				shapePointer++;
				if(shapePointer > 9) {
					shapePointer = 0;
				}
			}
			// Rectangle
			if(option == 3) {
				// Exercise
			}
			// Triangle
			if(option == 4) {
				// Exercise
			}
			// Previous calculate shape
			if(option == 5) {
				for(int i = 0; i < shapes.length; i++) {
					if(shapes[i] != null) {
						System.out.println(shapes[i]);
					}
				}
			}
			//Quit
			if(option == 6) {
				break;
			}
		}
		
		scanner.close();
	}
	
}
