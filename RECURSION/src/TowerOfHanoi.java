import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		char source='a',auxillary= 'b',dest= 'c';
		int start=1;
		int end=n;
	//	tower_of_hanoi(n,source,auxillary,dest);
		tower_of_hanoi(start,end,source,auxillary,dest);

	}
	
	/*public static void tower_of_hanoi(int n, char S, char A, char D)
	{
		/*if(n<=1)
		{
			System.out.println(S+" "+D);
			return;
		}*/
		
		
		//tower_of_hanoi(n-1, S, D, A);// sending n-1 disks from S to A
	//	System.out.println(S+" "+D);// sending nth disk from S to D
	//	tower_of_hanoi(n-1, A, S, D);// sending the n-1 disks from A to D}
	public static void tower_of_hanoi(int start,int end,char S,char A,char D)
	{
		if(start==end)
		{
			System.out.println(S+" "+D);
			return;
		}
		System.out.println(S+" "+D);
		tower_of_hanoi(start+1, end, S, A, D);
		System.out.println(A+" "+D);
	}

}
