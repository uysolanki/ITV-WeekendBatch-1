package day4;

import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
	int numbers[]=new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter a Number");    //virat=18 rohit=45 rahul=1 rishab=17 hardik=33
		numbers[i]=sc.nextInt();
	} 
	
	System.out.println("Enter a Number to search");    //17
	int num=sc.nextInt();
	int flag=0;      //assume NOT found
	for(int i=0;i<5;i++)
	{
		if(numbers[i]==num)
		{
			flag=1;
			break;
		}
	}
	
	if(flag==0)
	{
		System.out.println("Not Found");
	}
	else
	{
		System.out.println("Found");
	}
	
	
	
	sc.close();
}
}
