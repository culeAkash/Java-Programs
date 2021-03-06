import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int num= staircase(n);
		System.out.println(num);

	}
	
	public static int staircase(int n)
	{
		if(n==0)
		{
			return 1;// when we reach the top of the stairs if will be one way
		}
		int x=0,y=0,z=0;
		if(n>=1)
		{
			x=staircase(n-1);
		}
		if(n>=2)
		{
			y= staircase(n-2);
		}
		if(n>=3)
		{
			z= staircase(n-3);
		}
		return x+y+z;
	}

}
