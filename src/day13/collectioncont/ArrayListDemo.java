package day13.collectioncont;

import java.awt.LinearGradientPaint;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList()  No Args Constructor - default capacity=10
		
		List names1=new ArrayList();     // P p = new C()
		names1.add("Alice");
		names1.add("Ben");
		names1.add("Chris");
		names1.add(10);
		names1.add(10.8);
		names1.add(true);
		
		String name=(String)names1.get(0);
		
		List<String> names2=new ArrayList();
		names2.add("Alice");
		names2.add("Ben");
		names2.add("Chris");
		names2.add("Chris");
		names2.add("Chris");
		names2.add("Chris");
		names2.add(null);
		names2.add(null);
		names2.add(null);
		System.out.println(names2);
		
		String name1=names2.get(2);
		
		
		List<Integer> numbers=new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(1,"Rahul",98.5);
		
		List<Student> students=new ArrayList();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(s1.hashCode());
		System.out.println(students.size());
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
		
		
		
		List<String> names3=new ArrayList();
		names3.add("Alice");
		names3.add("Ben");
		names3.add("Chris");			//capacity =10    size=3
		for(int i=1;i<=7;i++)
		{
					//capacity =10    size=10
		}
		
		names3.add("ITVedant");			//new capacity =(old capacity * 1.5) + 1    size=11
										//capacity =16    size=11
		
		for(int i=1;i<=5;i++)
		{
			names3.add("FSD");
		}								//capacity =16    size=16
						
		names3.add("Tom");				//capacity =25   size=17
		
		names3.get(100);
		
		
		//ArrayList(int capacity)  Parameterised Constructor - user defined capacity
		
		//List<String> names=new ArrayList(25);
		
		List names4=new LinkedList();
		names4.add("Alice");
		names4.add("Ben");
		names4.add("Chris");
		
		
		//ArrayList(Collection c)  Parameterised Constructor - convert any collection to ArrayList
		
		List names5=new ArrayList(names4);
		
	}
}
