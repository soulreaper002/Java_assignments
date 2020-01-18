package com.example.shapes;

public class Circle {
	float radius;
	static float pi = 3.5f;
	public Circle()/*constructor 1*/
	{
		float radius = 1.5f;
		System.out.println("blank constructor");
	}
	protected Circle(float radius){
		this.radius=radius;
		System.out.println("single argument constructor");
		Circle c_3 = new Circle(12,0);
	}
	protected Circle(float radius ,float pi){
		this.pi=(float)3.5;
		this.radius=radius;
		System.out.println("two argument constructor invoked from constructor 2");
	}
	float calculateCircleArea(float radius) {
		float area = (pi*radius*radius);
			return(area);
	}
	float calculateCircumference(float radius) {
		float circumference=(2*pi*radius);
		return(circumference);
	}
	public static void main(String[] args) {
		Circle r_c = new Circle();
		Circle r_c1 = new Circle(12);
		float r = r_c.calculateCircleArea(12);
		System.out.println("Area of Circle is:"+r);
		float r_1 = r_c.calculateCircumference(12);
		System.out.println("Circumference of Circle is:"+r_1);
	}
}
