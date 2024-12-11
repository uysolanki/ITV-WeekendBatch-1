package psbatch;

public class CountOddEven {

	public static void main(String[] args) {
		int n=774;
		int oddc=0;
		int evenc=0;
		int sum=0;
		while(n>0)
		{
		int r=n%10;
		if(r%2==0)
		{
			evenc++;
		}
		else
		{
			oddc++;
		}
		sum+=r;
		n=n/10;
		}
		
		System.out.println(sum);
		System.out.println("Count of Even digits "+evenc);
		System.out.println("Count of Odd digits "+oddc);

	}

}
