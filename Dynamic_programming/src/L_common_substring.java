import java.util.*;

public class L_common_substring {
    public static int lc_substring(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int dp[][]=new int[m+1][n+1];
        //initialization
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        int ans=0;
        //tabulation
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abgce";
        System.out.println("Longest common substring is "+lc_substring(str1,str2));
    }
}
