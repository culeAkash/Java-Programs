package Intro;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(stairCaseI(n));

	}

	private static int stairCaseI(int n) {
		if(n<0) {
			return 0;
		}
		
		if(n<=1) {
			return 1;
		}
		int dp[] = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			int x=0,y=0,z=0;
			if(i-1>=0) {
				x=dp[i-1];
			}
			if(i-2>=0) {
				y=dp[i-2];
			}
			if(i-3>=0) {
				z=dp[i-3];
			}
			dp[i]=x+y+z;
		}
		
		return dp[n];
	}

	private static int stairCase(int n) {
		int[] dp= new int[n+1];
		
		for(int i=0;i<=n;i++) {
			dp[i]=-1;
		}
		
		return stairCase(n,dp);
		
	}

	private static int stairCase(int n, int[] dp) {
		if(n<0) {
			return 0;
		}
		
		if(n<=1) {
			return 1;
		}
		
		int x,y,z=0;
		
		if(dp[n-1]==-1) {
			x= stairCase(n-1, dp);
			dp[n-1]=x;
		}
		else {
			x= dp[n-1];
		}
		
		if(dp[n-2]==-1) {
			y= stairCase(n-2, dp);
			dp[n-2]=y;
		}
		else {
			y=dp[n-2];
		}
		
		if(n-3>=0) {
			if(dp[n-3]==-1) {
				z= stairCase(n-3, dp);
				dp[n-3]=y;
			}
			else {
				z=dp[n-3];
			}
		}
		
		return z+x+y;
	}

}
