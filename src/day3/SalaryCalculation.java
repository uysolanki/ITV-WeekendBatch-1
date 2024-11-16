package day3;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your Monthy Salary");
		double monthlySalary = scan1.nextDouble();
		
		if (monthlySalary >= 150000) {
			System.out.println("Excellent");
		} else if (monthlySalary >= 100000) {
			System.out.println("V Good");
		} else if (monthlySalary >= 75000) {
			System.out.println("Good");
		} else if (monthlySalary >= 50000) {
			System.out.println("OK");
		} else {
			System.out.println("Not OK");
		}
		
		
		System.out.println("Thank You");

	}

}
