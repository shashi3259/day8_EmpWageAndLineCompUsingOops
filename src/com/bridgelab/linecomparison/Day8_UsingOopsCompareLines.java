package com.bridgelab.linecomparison;

import java.util.Scanner;

class geometry{
	Scanner sc = new Scanner(System.in);

	// Length Between Two Points
	public void lengthBetweenTwoPoints() {
		System.out.print("Enter the value of x1 :");
		double x1 = sc.nextDouble();
		System.out.print("Enter the value of y1 :");
		double y1 = sc.nextDouble();
		System.out.print("Enter the value of x2 :");
		double x2 = sc.nextDouble();
		System.out.print("Enter the value of y2 :");
		double y2 = sc.nextDouble();

		double X = Math.pow(x2-x1, 2);
		double Y = Math.pow(y2-y1, 2);

		double length = Math.sqrt(X+Y);
		System.out.println("Lenght of a Line = "+ length);
	}

	// Checking two lines are equal or not
	public void equals() {
		System.out.println("Enter the co-ordinates for 1st point for 1st Line: ");
		double X1 = sc.nextDouble();
		double Y1 = sc.nextDouble();
		System.out.println("Enter the co-ordinates for 2nd point for 1st line: ");
		double X2 = sc.nextDouble();
		double Y2 = sc.nextDouble();

		System.out.println("Enter the co-ordinates for 1st point for 2nd Line: ");
		double A1 = sc.nextDouble();
		double B1 = sc.nextDouble();
		System.out.println("Enter the co-ordinates for 2nd point for 2nd Line: ");
		double A2 = sc.nextDouble();
		double B2 = sc.nextDouble();

		double x = Math.pow(X2-X1, 2);
		double y = Math.pow(Y2-Y1, 2);

		double a = Math.pow(A2-A1, 2);
		double b = Math.pow(B2-B1, 2);

		double Length = Math.sqrt(x+y);
		double Length2 = Math.sqrt(a+b);

		System.out.println("Length of Line between two co-ordinates are: " + Length);
		System.out.println("Length of Line between two co-ordinates are: " + Length2);
		if(Length == Length2) {
			System.out.println("Both lines are equal");
		}
		else {
			System.out.println("Both line are not equal.");
		}

	}

	// Compare lines
	public void compareTo() {
		System.out.println("Enter the co-ordinates for 1st point for 1st Line: ");
		double X1 = sc.nextDouble();
		double Y1 = sc.nextDouble();
		System.out.println("Enter the co-ordinates for 2nd point for 1st line: ");
		double X2 = sc.nextDouble();
		double Y2 = sc.nextDouble();

		System.out.println("Enter the co-ordinates for 1st point for 2nd Line: ");
		double A1 = sc.nextDouble();
		double B1 = sc.nextDouble();
		System.out.println("Enter the co-ordinates for 2nd point for 2nd Line: ");
		double A2 = sc.nextDouble();
		double B2 = sc.nextDouble();

		double x = Math.pow(X2-X1, 2);
		double y = Math.pow(Y2-Y1, 2);

		double a = Math.pow(A2-A1, 2);
		double b = Math.pow(B2-B1, 2);

		double Length = Math.sqrt(x+y);
		double Length2 = Math.sqrt(a+b);

		System.out.println("Length of Line between two co-ordinates are: " + Length);
		System.out.println("Length of Line between two co-ordinates are: " + Length2);
		if(Length == Length2) {
			System.out.println("Both lines are equal");
		}
		else if(Length>Length2) {
			System.out.println("1st Line is greater than 2nd Line.");
		}
		else {
			System.out.println("2nd Line is greater than 1st Line");
		}

	}

}





public class Day8_UsingOopsCompareLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		geometry calculate = new geometry();
		//		calculate.lengthBetweenTwoPoints();
		//		calculate.equals();
		calculate.compareTo();


	}

}
