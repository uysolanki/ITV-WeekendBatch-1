package day13.collectioncont;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",78.5);//"first",s1
		Student s2=new Student(45,"Rohit",88.5);//"second", s2
		Student s3=new Student(1,"Rahul",98.5); //"third", s3
		
		Map<String,Student> m100=new LinkedHashMap();
		m100.put("first", s1);
		m100.put("second", s2);
		m100.put("third", s3);
		
		System.out.println(m100);
		
		//display name of the student who has come 1st in m100 race
		System.out.println(m100.get("first").getSname());
		
		//display per of the student who has come 3rd in m100 race
		System.out.println(m100.get("third").getPer());

	}

}
