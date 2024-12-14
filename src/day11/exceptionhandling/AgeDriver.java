package day11.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeDriver {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		try {
		int age=sc.nextInt();
		if(age<=0)
		{
			throw new InvalidAgeException("Age cannot be zero or negative");
		}
		
		if(age>=18)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Minor");
		}
		}
		catch(InputMismatchException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(InvalidAgeException e2)
		{
			System.out.println(e2.getMessage());
		}
	}

}
