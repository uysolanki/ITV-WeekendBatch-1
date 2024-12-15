package day12.excepcontinued;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		int arr[]=new int[2];
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Number for Index 0");  //arr[0]=100 
		arr[0]=sc.nextInt();
		
		System.out.println("Enter Number for Index 1");  //arr[1]=5
		arr[1]=sc.nextInt();
		
				try
				{
					System.out.println("Please enter index of Numerator Number");  //100 
					int n=sc.nextInt(); //n=0
					System.out.println("Please enter index of Denominator Number");  //100 
					int d=sc.nextInt(); //d=1
					double result=arr[n]/arr[d];
					System.out.println(result);
				}
				catch(ArrayIndexOutOfBoundsException e1)
				{
					System.out.println("Please enter number 0 / 1 only");
				}
				catch(ArithmeticException e2)
				{
					System.out.println("Please enter non negative deno value");
				}
		
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter valid number only");
		}
	}

}
