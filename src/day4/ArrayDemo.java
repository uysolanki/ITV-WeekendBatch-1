package day4;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int chocolates[]=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter a Number");    //virat=18 rohit=45 rahul=1 rishab=17 hardik=33
			chocolates[i]=sc.nextInt();
		} 
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+chocolates[i];
		}
		System.out.println(sum);
	}
}
