package day3;

import java.util.Scanner;

public class McDBot {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int foodChoice,typeChoice,sizeChoice;
		System.out.println("***McD Menu***");
	
		System.out.println("1. Burger");
		System.out.println("2. Fries");
		System.out.println("3. Cold Drinks");
		System.out.println("0. Exit");
		

		System.out.println("Please enter your Food choice");
		foodChoice = scan1.nextInt();
		
		switch (foodChoice) {
		case 1:
			System.out.println("***Burger Types***");
			
			System.out.println("1. Veg");
			System.out.println("2. Non Veg");
			System.out.println("0. Exit");
			
			System.out.println("Please enter your Burger Type");
			typeChoice = scan1.nextInt();
			switch(typeChoice)
			{
			case 1:
				System.out.println("***Veg Burger Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your Burger Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small Veg Burger");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium Veg Burger");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large Veg Burger");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
				
			break;
			case 2:
				System.out.println("***Non Veg Burger Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your Burger Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small Non Veg Burger");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium Non Veg Burger");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large Non Veg Burger");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
			break;
			case 0:	System.exit(0);
			
			break;
			default: System.out.println("Invalid choice");
			}
		
		break;
		case 2:
			System.out.println("***Fries Types***");
			
			System.out.println("1. Salted");
			System.out.println("2. Peri Peri");
			System.out.println("0. Exit");
			
			System.out.println("Please enter your Fries Type");
			typeChoice = scan1.nextInt();
			switch(typeChoice)
			{
			case 1:
				System.out.println("***Salted Fries Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your Burger Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small Salted Fries");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium Salted Fries");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large Salted Fries");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
				
			break;
			case 2:
				System.out.println("***Peri Peri Fries Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your Peri Peri Fries Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small Peri Peri Fries ");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium Peri Peri Fries ");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large Peri Peri Fries ");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
			break;
			case 0:	System.exit(0);
			
			break;
			default: System.out.println("Invalid choice");
			}
		
		break;
		case 3:
		System.out.println("***Cold Drink Types***");
			
			System.out.println("1. Thums Up");
			System.out.println("2. Sprite");
			System.out.println("3. Coke");
			System.out.println("0. Exit");
			
			System.out.println("Please enter your Cold Drink Type");
			typeChoice = scan1.nextInt();
			switch(typeChoice)
			{
			case 1:
				System.out.println("***ThumsUp Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your ThumsUp Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small ThumsUp Cold drink");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium ThumsUp Cold drink");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large ThumsUp Cold drink");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
				
			break;
			case 2:
				System.out.println("***Sprite Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your Sprite Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small Sprite Cold drink");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium Sprite Cold drink");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large Sprite Cold drink");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
			break;
			case 3:
				System.out.println("***Coke Size Types***");
				
				System.out.println("1. Small");
				System.out.println("2. Medium");
				System.out.println("3. Large");
				System.out.println("0. Exit");
				System.out.println("Please enter your Coke Size Choice");
				sizeChoice = scan1.nextInt();
					switch(sizeChoice)
					{
						case 1:	System.out.println("You have Ordered 1 Small Coke Cold drink");
				
						break;
						case 2: System.out.println("You have Ordered 1 medium Coke Cold drink");
				
						break;
						case 3: System.out.println("You have Ordered 1 Large Coke Cold drink");
				
						break;
						case 0: System.exit(0);
				
						break;
						default: System.out.println("Invalid choice");
					}
			break;
			case 0:	System.exit(0);
			
			break;
			default: System.out.println("Invalid choice");
			}
		
		break;
		case 0:  System.exit(0);
		
		break;
		default: System.out.println("Invalid choice");
		}
		
	}

}
