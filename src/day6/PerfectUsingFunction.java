package day6;

import java.util.Scanner;

public class PerfectUsingFunction {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		boolean result=perfectNumber(n);
		if(result==true)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}

	}

	private static boolean perfectNumber(int n) {
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
