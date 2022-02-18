package com.saturn.hrm.poly;

public class PolyExample {

	public static void main(String[] args) {

		
//		 Circle circle = new Circle();
//		  
//		 Triangle triangle = new Triangle();
//		  
//		 circle.draw();
//		 triangle.draw();
		 

//		Shape shape = new Circle();
//		shape.draw();
//		
//		shape = new Triangle();
//		shape.draw();

		Injector injector = new Injector(new Triangle());
		
		injector.getShape().draw();
		
	}

}

class Injector{
	
	Shape shape;
	
	public Injector(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return this.shape;
	}
	
}

abstract class Shape {

	abstract void draw();

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Circle is Drawn");
	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Triangle is Drawn");

	}

}
