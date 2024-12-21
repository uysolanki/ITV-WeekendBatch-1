package day13.collectioncont;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
//		Map<String,Integer> employees=new HashMap();
//		employees.put("Alice",800);
//		employees.put("Ben",900);
//		employees.put("Chris",1000);
//		employees.put("David",800);
//		employees.put("Elcid",1100);
//		System.out.println(employees);
//		
//		employees.put("Alice",5000);
//		System.out.println(employees);
//		
//		System.out.println(employees.get("Chris"));
		
		
		Student s1=new Student(18,"Virat",78.5);//"first",s1
		Student s2=new Student(45,"Rohit",88.5);//"second", s2
		Student s3=new Student(1,"Rahul",98.5); //"third", s3
		
		Map<String,Student> m100=new HashMap();
		m100.put("first", s1);
		m100.put("second", s2);
		m100.put("third", s3);
		
		System.out.println(m100);
		
		
	}

}
