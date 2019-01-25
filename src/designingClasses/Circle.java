package designingClasses;

public class Circle {
	
	private int radius;
	public Circle() {  
		radius = 5;
	}
		
	public Circle(double r) {
		radius = (int) r;
	}
		
	public double perimeter() {
		return (2 * radius * Math.PI);
	}
		
	public double area() {
		return (Math.PI * radius * radius);
	}

}
