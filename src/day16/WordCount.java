package day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) throws IOException {
		String filename="itvwe/file1.txt";
		
		FileReader freader=new FileReader(filename);
		BufferedReader br=new BufferedReader(freader);
		
		//BufferedReader br1=new BufferedReader(new FileReader(filename));
		
		String line=br.readLine();
		System.out.println(line);
		
		String words[]=line.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println("Count Of Words "+words.length);
		
		br.close();
		freader.close();
		
	

	}

}
