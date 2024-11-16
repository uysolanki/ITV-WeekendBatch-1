package day3;

import java.util.Scanner;

public class CustomerCare {

	public static void main(String[] args) {
		System.out.println("*****MENU*****");
		System.out.println("1. English");
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		System.out.println("0. Exit");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your choice");
		int userChoice = scan1.nextInt();
		
		switch(userChoice)
		{
		case 1:System.out.println("Call Routed to London"); 
		
		break;
		case 2:System.out.println("Call Routed to Delhi"); 
		
		break;
		case 3:System.out.println("Call Routed to Solapur"); 
		
		break;
		case 0:System.exit(0);
		
		break;
		default:System.out.println("Invalid choice"); 
		}

		System.out.println("Thank You");
	}

}
