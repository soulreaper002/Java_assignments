package com.example.shapes;

public class Shapes {
	int numberOfSides;
	void  calculateShapeArea(int shape, int length) {
		this.numberOfSides=shape;
		if (numberOfSides==1) {
			Circle c = new Circle();
			c.calculateArea(length);
		}
		else if (numberOfSides==4) {
			Square s = new Square();
			s.calculateArea(length);
		}
		else if (numberOfSides==3) {
			Triangle t = new Triangle();
			t.calculateArea(length);
		}
		else {
			System.out.println("No Shapes Present");
		}
	}
	public static void main(String[] args) {
		Shapes s = new Shapes();
		s.calculateShapeArea(4, 6);
		
		
	}

}
