package day2;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		double weight;
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter your weight in kgs");
		weight=scan1.nextDouble();
		if(weight>60)
		{
			System.out.println("heavy");
		}
		else
		{
			System.out.println("light");
		}

	}

}
