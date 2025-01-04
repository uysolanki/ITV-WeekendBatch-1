package day16;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		String fileName="itvwe/file1.txt";
		FileWriter fwriter=new FileWriter(fileName);
		fwriter.write("Welcome to FSD Weekend batch");
		fwriter.close();
		
		System.out.println("File Content Written");

	}

}
