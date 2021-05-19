package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter rectangle heigth: ");
		rectangle.heigth = sc.nextDouble();
		
		System.out.println("The area of rectangle: " + rectangle.area());
		System.out.println("The perimeter of rectangle: " + rectangle.perimeter());
		System.out.println("The diagonal of rectangle: " + rectangle.diagonal());
			
		sc.close();
	}

}
