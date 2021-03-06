package Intro;

import java.util.Scanner;

public class ByteLandianCoins {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		int ans= byteLandCoinsBetterI(n);
		System.out.println(ans);

	}
	
	
	
	
	//iterative solution
	private static int byteLandCoinsBetterI(int n) {
		int[] dp= new int[n+1];
		dp[0]=0;
		
		for(int i=1;i<=n;i++) {
			dp[i]= Math.max(i, dp[i/2]+dp[i/3]+dp[i/4]);
		}
		
		return dp[n];
	}





	//memoized solutions
	private static int byteLandCoinsBetter(int n) {
		int[] dp= new int[n+1];
		
		for(int i=0;i<=n;i++) {
			dp[i]=-1;
		}
		
		return byteLandCoinsBetter(n,dp);
	}



	private static int byteLandCoinsBetter(int n, int[] dp) {
		if(n==0) {
			return 0;
		}
		int x,y,z;
		if(dp[n/2]==-1) {
			x= byteLandCoinsBetter(n/2, dp);
			dp[n/2]=x;
		}
		else {
			x=dp[n/2];
		}
		
		if(dp[n/3]==-1) {
			y= byteLandCoinsBetter(n/3, dp);
			dp[n/3]=y;
		}
		else {
			y=dp[n/3];
		}
		
		if(dp[n/4]==-1) {
			z= byteLandCoinsBetter(n/2, dp);
			dp[n/4]=z;
		}
		else {
			z=dp[n/4];
		}
		
		return Math.max(n, x+y+z);
		
		
		
	}


	//recursive solution
	private static int byteLandCoins(int n) {
		if(n==1) {
			return 1;
		}
		
		if(n==0) {
			return 0;
		}
		
		int x=0,y=0,z=0;
			x=byteLandCoins(n/2);
			y=byteLandCoins(n/3);
			z=byteLandCoins(n/4);
		
		return Math.max(n,x+y+z);
	}

}
