package day7;

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
			test();
		}
		static void test()
		{
			System.out.println("hi");
		}
}
