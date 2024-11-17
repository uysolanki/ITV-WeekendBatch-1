package day4;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		  //code 
		
//		int i=500;                                           //loop
//		while(i>=1)
//		{
//			System.out.println("Fergusson College "+i); 
//			i--;
//		}
		
//		int i;
//		for(i=500;i>=1;i--)
//		{
//			System.out.println("Wadia College "+i); 
//		}
//		System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter a Number");
			n=sc.nextInt();
			if(n<0)
			break;
			System.out.println(n*n);
		}while(n>0);
	}

}
