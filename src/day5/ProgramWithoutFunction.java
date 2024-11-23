package day5;

import java.util.Scanner;

public class ProgramWithoutFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length,width;
		
		System.out.println("Enter  Length of Rect");    
		length=sc.nextInt();  //7
		
		System.out.println("Enter  Width of Rect");    
		width=sc.nextInt();  //7
		
		int areaRect=length*width;
		
		System.out.println("Area of Rectangle is "+areaRect);
		

	}

}
