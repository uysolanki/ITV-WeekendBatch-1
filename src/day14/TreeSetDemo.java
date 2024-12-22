package day14;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> names=new TreeSet();
		names.add("Ben");
		names.add("Alice");
		names.add("Chris");
		System.out.println(names);
		
		
		Set<Student> students=new TreeSet();
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(45,"Rohit",68.5);
		Student s3=new Student(1,"Rahul",98.5);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);
		
		

	}

}
