package day2;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		/*
		 * per>=70 DIST per>=60 FC per>=50 SC per>=40 PC NP
		 */

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your HSC Percentage");
		double percentage = scan1.nextDouble();
		if (percentage >= 70) {
			System.out.println("DIST");
		} else if (percentage >= 60) {
			System.out.println("FC");
		} else if (percentage >= 50) {
			System.out.println("SC");
		} else if (percentage >= 40) {
			System.out.println("PC");
		} else {
			System.out.println("NP");
		}
		
		
		System.out.println("Thank You");
	}

}
