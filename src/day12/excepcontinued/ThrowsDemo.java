package day12.excepcontinued;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Numerator");  //10
		int n=sc.nextInt();
		System.out.println("Enter Denominator"); //0
		int d=sc.nextInt();
		double result=divide(n,d);
		System.out.println(result);
		}

	private static double divide(int n,int d) throws InvalidAgeException
	{
		return  n/d;
	}

}
