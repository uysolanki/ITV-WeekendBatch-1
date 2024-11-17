package day3;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String customerName;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your name");
		customerName=scan1.next();
		
		System.out.println("My name is "+customerName);
	}

}
