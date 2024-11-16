package test;

public class CBV {

	public static void main(String[] args) {
		int a=100;
		System.out.println(a);
		test(a);
		System.out.println(a);

	}

	private static void test(int b) {
		System.out.println(b);
		b+=1;
		System.out.println(b);
	}

}
