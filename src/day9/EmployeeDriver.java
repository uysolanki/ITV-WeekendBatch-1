package day9;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee team[]=new Employee[3];
		for(int i=0;i<team.length;i++)
		{
			 team[i]=new Employee();
			 team[i].acceptEmployee();
		}
		
		for(int i=0;i<team.length;i++)
		{
			 team[i].displayEmployee();
		}

		Scanner sc=new Scanner(System.in);
		System.out.println("1. Seach by Eno");
		System.out.println("2. Seach by Ename");
		
		System.out.println("Enter Choice");
		int choice=sc.nextInt(); 
		
		switch(choice)
		{
		case 1: 
			System.out.println("Enter Eno to Search");
			int seno=sc.nextInt();  //192
			for(int i=0;i<team.length;i++)
			{
				team[i].search(seno);
			}
		break;
		
		case 2:
			System.out.println("Enter Ename to Search");
			String sename=sc.next();  //192
			for(int i=0;i<team.length;i++)
			{
				team[i].search(sename);
			}
		break;
		default : System.out.println("Invalid Input");
		}
		
		
		
		
	}

}
