package day9;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		greet();
		greet(10);
		greet("Alice");

	}

	private static void greet(String string) {
		System.out.println("bye");
		
	}

	private static void greet() {
		System.out.println("Hi");
		
	}

	private static void greet(int i) {
		System.out.println("gn");
		
	}

}
