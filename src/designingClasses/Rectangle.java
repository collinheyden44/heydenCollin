package designingClasses;

public class Rectangle {
	
	private double length;
	private double width;
	public Rectangle() {  
		length = 10;
		width = 10;
	}
	
	public Rectangle( double l, double w) {
		length = l;
		width = w;
	}
	
	public double perimeter() {
		return (2 * length + 2 * width);
	}
	
	public double area() {
		return (length * width);
	}

}
