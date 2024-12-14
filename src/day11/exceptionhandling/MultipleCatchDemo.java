package day11.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");  //10
		int n=sc.nextInt();
		System.out.println("Enter Denominator"); //0
		int d=sc.nextInt();
		
		int result=n/d;
		
		System.out.println(result);
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Enter number only");
		}
		catch(ArithmeticException e2)
		{
			System.out.println(e2.getMessage());
		}
		catch(Exception e3)
		{
			System.out.println("Some Exception occured");
		}
		
		System.out.println("Thank You, Visit Again");
		
	}

}
