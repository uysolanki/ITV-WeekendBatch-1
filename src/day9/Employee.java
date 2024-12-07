package day9;

import java.util.Scanner;

public class Employee {
		private int eno;
		private String ename;
		private int salary;
		private static int headCount;   //default value =0
		
		public Employee()
		{
			this.eno=1;
			this.ename="Raj";
			this.salary=800;
			headCount++;
		}
		
		public Employee(int a, String b, int c)
		{
			this.eno=a;
			this.ename=b;
			this.salary=c;
			headCount++;
		}
		void acceptEmployee()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Eno");
			this.eno=sc.nextInt();
			System.out.println("Enter Ename");
			this.ename=sc.next();
			System.out.println("Enter Salary");
			this.salary=sc.nextInt();
		}
		void displayEmployee()
		{
			System.out.println("Emp no is" +this.eno);
			System.out.println("Emp name is" +this.ename);
			System.out.println("Emp Salary is" +this.salary);
		}
		
		static void displayHeadCount()
		{
			int x;
			System.out.println("Emp HeadCount is" + Employee.headCount);
		}
									  //eno 	       //this.eno
		public boolean search(int eno)//194		 //191    192   193
		{
			if(this.eno==eno)
					return true;
			else
					return false;
		}
		public void search(String ename)
		{
			if(this.ename.equals(ename))
			{
				System.out.println("Employee Found");
			}
		}
}
