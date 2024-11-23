package day5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");    
		int n=sc.nextInt();  //7
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
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
