package day13.collectioncont;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");	//nitish
		String input=sc.next();
		
		System.out.println(input);
		
		Stack<Character> stack=new Stack();
		for(char c : input.toCharArray())
		{
			stack.push(c);
		}
		
		int flag=0;
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);		//c== 'n'
			char d= stack.pop();		//d== 'n'
			
			if(c!=d)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Not Palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}

	}

}
