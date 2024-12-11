package psbatch;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=122;
		int temp=n;
		int rev=0;
		while(n>0)
		{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		
		System.out.println(temp);
		System.out.println(rev);
		
		
		System.out.println(temp==rev?"Palindrome Numberrr":"Not Palindrome Numberrr");
	}

}
