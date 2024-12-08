package day8;

import java.util.Scanner;

public class Employee extends Person
{
	int eno;
	String desg;
	double salary;
	
	public void acceptEmployee()
	{
		super.acceptPerson();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Number");
		this.eno=sc.nextInt();
		System.out.println("Enter Designation");
		this.desg=sc.next();
		System.out.println("Enter Salary");
		this.salary=sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		super.displayPerson();
		System.out.println("Employee Number is "+this.eno);
		System.out.println("Employee Designation is "+this.desg);
		System.out.println("Employee Salary is "+this.salary);
	}
}
