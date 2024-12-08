package day10;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TurfDriver {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	String customerName=sc.next();
	
	LocalDateTime timing=LocalDateTime.now();
	
	System.out.println("Enter Mobile Number");
	String customerMobile=sc.next();
	
	System.out.println("***Turf Options***");
	System.out.println("1. Cricket");
	System.out.println("2. Football");
	System.out.println("3. Tennis");
	System.out.println("4. Skating");
	
	System.out.println("Enter Choice");
	int turfChoice=sc.nextInt();
	
	Turf t1=TurfSupervisor.getTurf(turfChoice);
	
	System.out.println("***Accessories Options***");
	System.out.println("1. Cricket");
	System.out.println("2. Football");
	
	
	System.out.println("Enter Choice");
	int accChoice=sc.nextInt();
	
	Accessories a1=AccessorySupervisor.getAccessory(accChoice);
	
	System.out.println("Customer Name "+ customerName);
	System.out.println("Customer Mobile "+ customerMobile);
	System.out.println("DateTime "+ timing);
	System.out.println("Turf Price "+ t1.getTurfPrice());
	System.out.println("Acc Price "+ a1.getAccCost());
	System.out.println("Total Price "+ (t1.getTurfPrice() + a1.getAccCost()));
	}

}
