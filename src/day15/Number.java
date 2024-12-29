package day15;

public class Number extends Thread
{
@Override
public void run() {
	for(int i=1;i<=26;i++)
	{
		System.out.println("\t\t"+i);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
}
