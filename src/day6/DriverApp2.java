package day6;

import java.util.Scanner;

public class DriverApp2 {

	public static void main(String[] args) {
		Student batch[] = new Student[3];
		
		for(int i=0;i<batch.length;i++)
		{
			batch[i]=new Student();
			batch[i].acceptStudent();
		}

		for(int i=0;i<batch.length;i++)
		{
			batch[i].displayStudent();
		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rno to search");   //n=45
		int n=sc.nextInt();
		
		for(int i=0;i<batch.length;i++)
		{
			batch[i].search(n);
		}
	}

}
