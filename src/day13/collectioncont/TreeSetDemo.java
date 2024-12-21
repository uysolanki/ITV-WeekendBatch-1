package day13.collectioncont;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> names2=new TreeSet();
		names2.add("Alice");     //Alice  Ben  Chris  David Elcid Frank George
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
