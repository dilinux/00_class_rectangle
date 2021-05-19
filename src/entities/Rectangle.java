package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	public double result;
	
	public double area() {
		
		result = width * heigth;
		return result;
	}
	
	public double perimeter() {
		
		result = 2*(width + heigth);
		return result;
	}
	
	public double diagonal() {
		
		result = Math.sqrt((width*width) + (heigth*heigth));
		return result;
	}

}
