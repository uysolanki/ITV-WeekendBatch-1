package day5;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args) //Ambani
	{	
		int answer;
		Scanner sc = new Scanner(System.in);
		int ilength,iwidth;
		
		System.out.println("Enter  Length of Rect");    
		ilength=sc.nextInt();  
		
		System.out.println("Enter  Width of Rect");    	
		iwidth=sc.nextInt(); 								//buy
		
		answer=areaOfRectangle(ilength,iwidth);				//function call
		System.out.println("Area of Rectangle is "+answer);	//Serve
	}
	

	private static int areaOfRectangle(int x,int y)	//Royal Caterer
	{
		int areaRect=x*y;								//Cook
		return areaRect;
	}

}
