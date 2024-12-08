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
	
	Turf t1=null;
	switch(turfChoice)
	{
	case 1 :	t1 =new CricketTurf(); break;
	case 2 :	t1 =new FootballTurf(); break;
	case 3 :	t1 =new TennisTurf(); break;
	case 4 :	t1 =new SkatingTurf(); break;
	default : System.out.println("Invalid Input");
	}

	System.out.println("Customer Name "+ customerName);
	System.out.println("Customer Mobile "+ customerMobile);
	System.out.println("DateTime "+ timing);
	System.out.println("Price "+ t1.getTurfPrice());
	}

}
