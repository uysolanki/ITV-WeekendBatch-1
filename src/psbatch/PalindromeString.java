package psbatch;

public class PalindromeString {

	public static void main(String[] args) {
		String name="nitiz";
		int j=name.length()-1;
		int flag=0;			//assume String is Anagram
		for(int i=0;i<=name.length()/2;i++)
		{
			if(name.charAt(i)!=name.charAt(j))
			{
				flag=1;
				break;
			}
			j--;
		}
		
		if(flag==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		StringBuffer sb=new StringBuffer("Apple");
	}
	

}
