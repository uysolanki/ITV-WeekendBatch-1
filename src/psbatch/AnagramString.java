package psbatch;

public class AnagramString {

	public static void main(String[] args) {
	String s1="boss";
	String s2="ossb";
	
	if(s1.length()!=s2.length())
	{
		System.out.println("Not Possible ");
	}
	else
	{
		int counter=0;  //1 2 3
		for(char c:s1.toCharArray())
		{
			for(int i=0;i<s2.length();i++)
			{
				if(s2.charAt(i)==c)
				{
					counter++;
					break;
				}
			}
		}
		
		if(counter==s1.length())
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("Not Anagram String");
		}
	}
	
	

	}

}
