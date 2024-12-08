package day10;

public class TurfSupervisor {
			static Turf t1;
			static Turf getTurf(int turfChoice)
			{
			switch(turfChoice)
			{
			case 1 :	t1 =new CricketTurf(); break;
			case 2 :	t1 =new FootballTurf(); break;
			case 3 :	t1 =new TennisTurf(); break;
			case 4 :	t1 =new SkatingTurf(); break;
			default : return null;
			}
			return t1;
			}
}
