package day5;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args) //Ambani
	{
	
		areaOfCircle();
		areaOfRectangle();						//function call
	}

	
	
	private static void areaOfCircle() {
		Scanner sc = new Scanner(System.in);
		int radius;
		
		System.out.println("Enter  raidus of circle");    
		radius=sc.nextInt();
		
		double areaCircle=3.14*radius*radius;
		
		System.out.println("Area of Circle is "+areaCircle);
		
		areaOfRectangle();	
	}

	private static void areaOfRectangle()						//Taj
	{
		Scanner sc = new Scanner(System.in);
		int length,width;
		
		System.out.println("Enter  Length of Rect");    
		length=sc.nextInt();  
		
		System.out.println("Enter  Width of Rect");    	
		width=sc.nextInt(); 									//Buy
		
		int areaRect=length*width;								//Cook
		
		System.out.println("Area of Rectangle is "+areaRect);	//Serve
	}

}
