package day6;

import java.util.Scanner;

public class PrimeUsingFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		boolean result=primeNumber(n);
		if(result==true)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}

	}

	private static boolean primeNumber(int n) {
		int counter=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				counter++;
			}
		}
		
		if(counter==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
