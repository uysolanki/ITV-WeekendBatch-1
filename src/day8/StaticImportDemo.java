package day8;

import static java.lang.Math.*;

public class StaticImportDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI*5*5);  //without importing static
		
		System.out.println(PI*5*5);  // with importing static
		System.out.println(sqrt(9));  // with importing static
		
	}

}
