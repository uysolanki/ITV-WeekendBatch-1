package day11.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionNaturalBehaviour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		try
		{
		int n=sc.nextInt();
		System.out.println(n*n);
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter number only");
		}
		System.out.println("hiiii");
		System.out.println("bye");
		System.out.println("gn");	
	}

}
