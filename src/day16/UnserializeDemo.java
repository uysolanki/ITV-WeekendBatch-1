package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnserializeDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String filename = "itvwe/file2.dat";
	
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename));

		Student s1=(Student)ois.readObject();
		
		System.out.println(s1.getRno());
		System.out.println(s1.getSname());

	}

}
