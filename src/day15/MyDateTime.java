package day15;

public class MyDateTime extends Thread
{
@Override
public void run() {
	int hh=0;
	int mm=0;
	int ss=0;
	
	
	while(hh<12)
	{
		while(mm<=59)
		{
			while(ss<=59)
			{
				ss++;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(hh + ":" + mm + ":" + ss);
			}
			ss=0;
			mm++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(hh + ":" + mm + ":" + ss);
		}
		mm=0;
		hh++;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(hh + ":" + mm + ":" + ss);
	}
	
}
}
