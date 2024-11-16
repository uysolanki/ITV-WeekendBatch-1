package day3;

import java.util.Scanner;

public class CustomerCarePro {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int langChoice;
		int accentChoice;
		
		System.out.println("*****LANGUAGE MENU*****");
		System.out.println("1. English");
		System.out.println("2. Arabic");
		System.out.println("0. Exit");
		
		
		System.out.println("Please enter your Language choice");
		langChoice = scan1.nextInt();
		
		switch(langChoice)
		{
		case 1:
			System.out.println("*****ENGLISH ACCENT MENU*****");
			System.out.println("1. UK");
			System.out.println("2. US");
			System.out.println("3. Aus");
			System.out.println("0. Exit");
			System.out.println("Please enter your English Accent choice");
			accentChoice = scan1.nextInt();
			switch(accentChoice)
			{
			case 1: System.out.println("call routed to London");
			
			break;
			case 2: System.out.println("call routed to New York");
			
			break;
			case 3:	System.out.println("call routed to Sydney");
				
			break;
			case 0: System.exit(0);
				
			break;
			default: System.out.println("Invalid choice");
			}
		System.out.println("Thank You for calling Airtel!!");
		break;
		case 2:
			System.out.println("*****ARABIC ACCENT MENU*****");
			System.out.println("1. Dubai");
			System.out.println("2. Qatar");
			System.out.println("3. Oman");
			System.out.println("0. Exit");
			System.out.println("Please enter your Arabic Accent choice");
			accentChoice = scan1.nextInt();
			switch(accentChoice)
			{
			case 1: System.out.println("call routed to Abu Dhabi");
			
			break;
			case 2: System.out.println("call routed to Doha");
			
			break;
			case 3:	System.out.println("call routed to Muscat");
				
			break;
			case 0: System.exit(0);
				
			break;
			default: System.out.println("Invalid choice");
			}
		System.out.println("Shukran for calling Airtel!!");
		break;
		case 0:
			System.exit(0);
			
		break;
		default:System.out.println("Invalid choice");
		}
		
		
	}
}
