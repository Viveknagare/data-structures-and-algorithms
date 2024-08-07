import java.util.*;

public class Edit_distance {
    public static int editdistance(String word1, String word2){
        int m=word1.length();
        int n=word2.length();
        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int ad=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int rep=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(ad,Math.min(del,rep));
                }
            }
        }
        return dp[m][n];
    }
    public static int minDistance(String word1, String word2) {
        return editdistance(word1,word2);
    }

    public static void main(String[] args) {
        String word1="intention";
        String word2="execution";
        System.out.println("the minimum number of operations are "+minDistance(word1,word2));
    }
}