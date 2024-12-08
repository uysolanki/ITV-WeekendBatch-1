package day9;

public abstract class Tiger implements Animal
{

	@Override
	public void sleep() {
		System.out.println("Sleeps in a cave");
		
	}

	@Override
	public void eat() {
		System.out.println("Eats Fresh Flesh");
		
	}
}
