package day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {

	public static void main(String[] args) throws IOException {
		String filename="itvwe/file1.txt";
		
		BufferedReader br1=new BufferedReader(new FileReader(filename));
		String line;
		int wordCount=0;
		while ((line = br1.readLine()) != null) 
		{
			String words[]=line.split("\\s");
			wordCount+=words.length;
			System.out.println(line);
		}
		System.out.println("Count Of Words "+wordCount);

	}

}
