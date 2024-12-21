package day13.collectioncont;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",78.5);//"first",s1
		Student s2=new Student(45,"Rohit",88.5);//"second", s2
		Student s3=new Student(1,"Rahul",98.5); //"third", s3
		
		Map<String,Student> m100=new TreeMap();
		m100.put("first", s1);
		m100.put("third", s3);
		m100.put("second", s2);
		
		System.out.println(m100);
		
		Student s4=new Student(17,"Rishab",78.5);//"first",s1
		Student s5=new Student(33,"Hardik",88.5);//"second", s2
		Student s6=new Student(73,"Siraj",98.5); //"third", s3
		
		Map<String,Student> m200=new TreeMap();
		m200.put("first", s4);
		m200.put("third", s5);
		m200.put("second", s6);
		
		System.out.println(m200);
		
		//display name of the student who has come 2nd in m200 race
		System.out.println(m200.get("second").getSname());
		
		List <Map<String,Student>>  olympic=new ArrayList();
		olympic.add(m100);
		olympic.add(m200);
		
		//display name of the student who has come 2nd in m200 race using olympic
		System.out.println(olympic.get(1).get("second").getSname());
		
		
		int arr[]= {11,20,22,32,55};
//		int oddc=0;
//		int evenc=0;
//		for(int n:arr)
//		{
//			if(n%2==0)
//				evenc++;
//			else
//				oddc++;
//		}
//		System.out.println("Odd Count "+oddc);
//		System.out.println("Even Count "+evenc);
		
		
		HashMap<String,Integer> counts=new HashMap();
		counts.put("even", 0);
		counts.put("odd", 0);
		for(int n:arr)
		{
			if(n%2==0)
			{
				counts.put("even", counts.get("even")+1);
			}
			else
			{
				counts.put("odd", counts.get("odd")+1);
			}
		}
		
		System.out.println(counts);
	}
	
	
	

}
