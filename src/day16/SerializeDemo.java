package day16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String filename = "itvwe/file2.dat";
//		FileOutputStream fos=new FileOutputStream(filename);
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename));

		Student s1=new Student(18,"Virat");
		oos.writeObject(s1);
		
		System.out.println("Object Written to File");


	}

}
