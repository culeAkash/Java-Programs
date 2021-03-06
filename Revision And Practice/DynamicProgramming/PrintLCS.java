package DynamicProgramming;

import java.util.Scanner;

public class PrintLCS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();

        System.out.println(printLCS(s1,s2,s1.length(),s2.length()));
        sc.close();
    }

    private static String printLCS(String s1, String s2, int n, int m) {
            int[][] dp= new int[n+1][m+1];

            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                        dp[i][j] = 1+ dp[i-1][j-1];
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            int i=n,j=m;
            String ans="";
            while(i>0 && j>0){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    ans= s1.charAt(i-1) + ans;
                    i--;
                    j--;
                }
                else{
                    if(dp[i-1][j]>dp[i][j-1])
                        i--;
                    else
                        j--;
                }
            }
            return ans;
    }
}
