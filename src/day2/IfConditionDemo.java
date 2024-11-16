package day2;

import java.util.Scanner;

public class IfConditionDemo {

	public static void main(String[] args) {
		int age;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are "+age+" years old, you are Adult");
		}
		else
		{
			System.out.println("You are "+age+" years old, you are Minor");
		}

	}

}
