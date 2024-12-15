package day12.excepcontinued;

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}
