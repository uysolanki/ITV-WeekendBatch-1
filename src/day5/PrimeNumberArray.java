package day5;

import java.util.Scanner;

public class PrimeNumberArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n;
		for (i = 0; i < arr.length; i++) // i
		{ // 0 1 2 3 4
			System.out.println("Enter a number"); // 7 18 23 8 9
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < arr.length; i++) {
			n = arr[i];
			int counter = 0;
			for (j = 1; j <= n; j++) {
				if (n % j == 0) {
					counter++;
				}
			}

			if (counter == 2) {
				System.out.println(n);
			}
		}

	}

}
