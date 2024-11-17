package day4;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum=0;
		int i;
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n=sc.nextInt();
		System.out.println("Peon Pocket " +sum);
		while(sum<=50)
		{
		
				for(i=1;i<=5;i++)
				{
					System.out.println("Roll Number " + i + " How many chocolates have you bought?");
					int n=sc.nextInt();
			
					if(n>20)
						continue;
			
					if(	(i%2==1 && n%2==0) ||  (i%2==0 && n%2==1))
						sum=sum+n;
			
					if(sum>=50)
						break;
					System.out.println("Peon Pocket " +sum);
				}
		}
		System.out.println("Total chocolates collected" +sum);
		System.out.println("Surplus chocolates collected" +(sum-50));
	}

}
