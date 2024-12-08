package day8;

import java.util.Scanner;

public class Person {
	long adharNumber;
	String name;
	int age;
	String city;
	
	public void acceptPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Adhar Number");
		this.adharNumber=sc.nextLong();
		System.out.println("Enter Name");
		this.name=sc.next();
		System.out.println("Enter Age");
		this.age=sc.nextInt();
		System.out.println("Enter City");
		this.city=sc.next();
	}
	
	public void displayPerson()
	{
		System.out.println("Adhar Number is "+this.adharNumber);
		System.out.println("Name is "+this.name);
		System.out.println("Age is "+this.age);
		System.out.println("City is "+this.city);
	}
}
