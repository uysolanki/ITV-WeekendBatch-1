package day14;

public class ImmutableDemo {

	public static void main(String[] args) {
	String name1="Alice";
	System.out.println(name1);
	
	String name2=name1.concat(" Peter");
	System.out.println(name2);
	
	System.out.println(name1==name2);

	}

}
