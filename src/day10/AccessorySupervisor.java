package day10;

public class AccessorySupervisor {
	static Accessories a1;
	
	static Accessories getAccessory(int n)
	{
		switch(n)
		{
		case 1 :	a1 =new CricketAccessory(); break;
		case 2 :	a1 =new FootballAccessory(); break;
		default : return null;
		}
		return a1;
	}

}
