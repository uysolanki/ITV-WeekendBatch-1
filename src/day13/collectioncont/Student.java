package day13.collectioncont;

import java.util.Scanner;

public class Student {
	private String sname;
	private int rno;
	private double per;
	
	public Student()	//No Args Constructor
	{
		sname="Vedant";
		rno=1;
		per=60.0;
	}
	
	public Student(String a,int b,double c) //All Args Constructor
	{
		sname=a;
		rno=b;
		per=c;
	}
	
	public Student(int b,String a,double c) //All Args Constructor
	{
		sname=a;
		rno=b;
		per=c;
	}
	
	
	public Student(Student temp)  //Copy Constructor
	{
		sname=temp.sname;
		rno=temp.rno;
		per=temp.per;
	}
	public void acceptStudent()					//	batch[0]    batch[1]    batch[2]
	{
		Scanner sc=new Scanner(System.in);		//   	s1      	s2  
		
		System.out.println("Enter Student name");  		//Virat  	Rohit   Rishab
		sname=sc.next();
		
		System.out.println("Enter Student rno");		//18  		45      17
		rno=sc.nextInt();
		
		System.out.println("Enter Student percentage"); //78.5  	88.5    98.5
		per=sc.nextDouble();
	}
	public void displayStudent()
	{
		System.out.println("Student Name is "+sname);
		System.out.println("Student Roll Number is "+rno);
		System.out.println("Student Percentage is "+per);
	}
}
