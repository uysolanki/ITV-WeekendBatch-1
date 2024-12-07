package day8;

public class StaticImportDemo {

	static int x,y,z;
	
	static {
		x=18;
		y=19;
		z=199;
	}

	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
