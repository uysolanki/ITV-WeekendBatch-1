package day12.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
//		ArrayList a1=new ArrayList();
//		a1.add("Alice");  //0
//		a1.add("Ben");    //1
//						
//		a1.add("Chris");  //2
//		a1.add("David");  //3
//		System.out.println(a1.size());  //4
//		System.out.println(a1.isEmpty());  
//		
//		System.out.println(a1);
//		
//		a1.add(2,"Tom");
//		System.out.println(a1.size());  //5
//		System.out.println(a1);
//		
//		System.out.println(a1.remove("David"));
//		System.out.println(a1);
//		
//		System.out.println(a1.remove("Jack"));
//		System.out.println(a1);
//		a1.remove(1);
//		System.out.println(a1);
//		System.out.println(a1.size());  //3
//		a1.clear();
//		System.out.println(a1.isEmpty());  
//		System.out.println(a1.size());  
		
		
		ArrayList mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		ArrayList rj=new ArrayList();
		rj.add("Jaipur");
		rj.add("Bikaner");
		rj.add("Fathepur");
		
		ArrayList India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		
		System.out.println(India);
		India.add("Chennai");
		India.add("Kolkata");
		
		System.out.println(India.size());
		
		//India.removeAll(rj);
		System.out.println(India);
		
		India.retainAll(rj);
		System.out.println(India);
		System.out.println(India.isEmpty());
		India.clear();
		System.out.println(India.isEmpty());
		System.out.println(rj.isEmpty());
	}

}
