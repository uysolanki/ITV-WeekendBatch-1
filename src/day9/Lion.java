package day9;

public class Lion implements Animal
{

	@Override
	public void sleep() {
		System.out.println("Lion sleeps in a den");
		
	}

	@Override
	public void eat() {
		System.out.println("Eats flesh");
		
	}

	@Override
	public void hunt() {
		System.out.println("Hunts self");
		
	}

}
