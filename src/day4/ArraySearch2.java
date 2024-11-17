package day4;

import java.util.Scanner;

public class ArraySearch2 {
public static void main(String[] args) {
	int numbers[]=new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++)
	{											 //  i  =0        1        2        3          4    5
		System.out.println("Enter a Number");    //virat=18 rohit=45 rahul=1 rishab=17 hardik=33
		numbers[i]=sc.nextInt();
	} 
	
	System.out.println("Enter a Number to search");    //17
	int num=sc.nextInt();
	int i;
	for(i=0;i<5;i++)
	{
		if(numbers[i]==num)
		{
			System.out.println("Found at Index "+i);
			break;
		}
	}
	
	if(i==5)
		System.out.println("Not Found");
	
	sc.close();
}
}
