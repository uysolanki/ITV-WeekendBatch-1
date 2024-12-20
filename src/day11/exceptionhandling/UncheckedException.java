package day11.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		int arr[]= {10,20};
		int x=arr[2];
		
		System.out.println("Enter Numerator");  //10
		int n=sc.nextInt();
		System.out.println("Enter Denominator"); //0
		int d=sc.nextInt();
		
		int result=n/d;
		}
		catch(InputMismatchException|ArithmeticException e1)
		{
			System.out.println("Invalid Input");
		}
		catch(RuntimeException e2)
		{
			System.out.println("Some exception occured");
		}

	}

}
