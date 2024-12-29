package day15;

public class MultiThreadDemo {

	public static void main(String[] args) {
		Number thread1=new Number();
		Alpha thread2=new Alpha();
		thread1.start();
		thread2.start();
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		for(int i=27;i<=52;i++)
		{
			System.out.println("\t"+i);
		}
		
	}

}
