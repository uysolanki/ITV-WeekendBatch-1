package day12.excepcontinued;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");  //10
		int n=sc.nextInt();
		System.out.println("Enter Denominator"); //0
		int d=sc.nextInt();
		double result=n/d;
		System.out.println(result);
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter valid number only");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Please enter non negative deno value");
		}
		
		finally
		{
			System.out.println("Thank You! Visit Again");
		}

	}

}
