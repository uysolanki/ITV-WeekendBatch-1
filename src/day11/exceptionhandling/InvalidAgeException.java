package day11.exceptionhandling;

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}
