package day10;

public abstract class Animal {

	public void eat()
	{
		System.out.println("Animal eat");
	}
	
	public void sleep()
	{
		System.out.println("Animal sleep");
	}
	
	public abstract void hunt();
	
	static void testStatic()
	{
		System.out.println("Test Static method");
	}
}
