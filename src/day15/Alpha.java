package day15;

public class Alpha extends Thread
{
@Override
public void run() {
	for(char i='a';i<='z';i++)
	{
		System.out.println(i);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
}
