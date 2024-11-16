package test;

public class FunctionDemo {

	public static void main(String[] args) {
		System.out.println("I am in Main");
		brazil();
		System.out.println("I am finally back in Main");
	}

	private static void brazil() {
		System.out.println("I am in Brazil");
		argentina();
		System.out.println("I am back in Brazil");
		
	}

	private static void argentina() {
		System.out.println("I am in Argentina");
	}

}
