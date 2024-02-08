
import java.util.*;
public class LCS {
    public static int lcs(String str1,String str2,int m,int n){
        if(m==0 || n==0) {
            return 0;
        }

        if(str1.charAt(m-1)== str1.charAt(n-1)){
            return 1+lcs(str1,str2,m-1,n-1);
        }else{
            int max1=lcs(str1,str2,m-1,n);
            int max2=lcs(str1,str2,m,n-1);
            return Math.max(max1,max2);
        }
    }

    //lcs2=memoization
    public static int lcs2(String str1,String str2,int m,int n,int[][]dp){
        if(m==0 || n==0) {
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        if(str1.charAt(m-1)== str2.charAt(n-1)){
            return dp[m][n]=1+lcs2(str1,str2,m-1,n-1,dp);
        }else{
            int max1=lcs2(str1,str2,m-1,n,dp);
            int max2=lcs2(str1,str2,m,n-1,dp);
            return dp[m][n]=Math.max(max1,max2);
        }
    }

    public static int lcs_tabulation(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++ ){
            for(int j=0;j<n+1;j++ ){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<m+1;i++) {
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="ace";
        int m=str1.length();
        int n=str2.length();
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++) {
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println("the longest common subsequence is "+lcs(str1,str2,str1.length(),str2.length()));
        System.out.println("the longest common subsequence is "+lcs2(str1,str2,str1.length(),str2.length(),dp));
        System.out.println("the longest common subsequence is "+lcs_tabulation(str1,str2));
    }

}
