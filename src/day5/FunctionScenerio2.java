package day5;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args) //Ambani
	{	
		int answer;
		answer=areaOfRectangle();						    //function call
		System.out.println("Area of Rectangle is "+answer);	//Serve
	}
	

	private static int areaOfRectangle()						//Taj
	{
		Scanner sc = new Scanner(System.in);
		int length,width;
		
		System.out.println("Enter  Length of Rect");    
		length=sc.nextInt();  
		
		System.out.println("Enter  Width of Rect");    	
		width=sc.nextInt(); 									//Buy
		
		int areaRect=length*width;								//Cook
		
		return areaRect;
	}

}
