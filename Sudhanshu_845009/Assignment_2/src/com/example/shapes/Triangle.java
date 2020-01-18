package com.example.shapes;

public class Triangle {
	void calculateArea(int sideLength){
		float area=(float)(((sideLength*sideLength)*1.732)/4);
		System.out.println("The Area of the Triangle is "+area);
	}
}
