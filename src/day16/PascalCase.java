package day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PascalCase {

	public static void main(String[] args) throws IOException {
		String filename="itvwe/file1.txt";
		
		BufferedReader br1=new BufferedReader(new FileReader(filename));
		String line;
		
		StringBuffer result = new StringBuffer();//"Welcome "
		
		while ((line = br1.readLine()) != null) 
		{
			String words[]=line.split("\\s");
			
			for(String word:words)
			result.append(Character.toTitleCase(word.charAt(0)))
			.append(word.substring(1))
			.append(" ");
		}
		System.out.println(result);

	}

}
