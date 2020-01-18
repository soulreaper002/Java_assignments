package com.example.shapes;

public class Shapes {
	int numberOfSides;
	void  calculateShapeArea(int shape, int length) {
		this.numberOfSides=shape;
		switch(numberOfSides) {
		case 1:
			Circle c = new Circle();
			c.calculateArea(length);
			break;
		case 4:
			Square s = new Square();
			s.calculateArea(length);
			break;
		case 3:
			Triangle t = new Triangle();
			t.calculateArea(length);
			break;
		default:
			System.out.println("No Shapes Present");
		}
	}
	public static void main(String[] args) {
		Shapes s = new Shapes();
		s.calculateShapeArea(3, 12);
		
		
	}

}

