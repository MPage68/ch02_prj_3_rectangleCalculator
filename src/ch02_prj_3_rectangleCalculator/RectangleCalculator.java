package ch02_prj_3_rectangleCalculator;

import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the rectangle calculator");
		Scanner sc = new Scanner(System.in);
		// variables
		double length = 0.0;
		double width = 0.0;
		double area = 0.0;
		double perimeter = 0.0;
		String choice = "y";

		// while loop
		while (!choice.equalsIgnoreCase("n")) {

			// user input
			System.out.print("Enter length:\t");
			length = sc.nextDouble();
			System.out.print("Enter width:\t");
			width = sc.nextDouble();
			// logic
			area = (length * width);
			perimeter = (2 * width + 2 * length);
			// user output
			System.out.println("Area:\t        " + area + "\n" + "Perimeter:\t" + perimeter);
			System.out.print("Continue:\t (y/n)\t");
			choice = sc.next();
		}
		// Goodbye statement/scanner close
		System.out.println("Goodbye");
		sc.close();
	}
}
