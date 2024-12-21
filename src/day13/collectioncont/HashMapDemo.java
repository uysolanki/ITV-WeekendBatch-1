package day13.collectioncont;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> employees=new HashMap();
		employees.put("Alice",800);
		employees.put("Ben",900);
		employees.put("Chris",1000);
		employees.put("David",800);
		employees.put("Elcid",1100);
		System.out.println(employees);
		
		employees.put("Alice",5000);
		System.out.println(employees);
		
		System.out.println(employees.get("Chris"));
		
		
	}

}
