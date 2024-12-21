package day13.collectioncont;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> names2=new LinkedHashSet();
		names2.add("Alice");     //Alice  Ben  Frank  George David Chris Elcid
		names2.add("Ben");
		names2.add("Frank");
		names2.add("George");
		names2.add("David");
		names2.add("Chris");
		names2.add("Elcid");
		
		names2.add("David");
		names2.add("Chris");
		names2.add("Elcid");
		
		
		System.out.println(names2);

	}

}
