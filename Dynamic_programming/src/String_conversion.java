//Given two strings word1 and word2, return the minimum number of steps required to make
// word1 and word2 the same.
//In one step, you can delete exactly one character in either string.
//
//
//        Input: word1 = "sea", word2 = "eat"
//        Output: 2
//        Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea"
public class String_conversion {
    public static int minOperations(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        int[][]dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }

        int lcs_length=dp[m][n];
        int diff1=m-lcs_length;
        int diff2=n-lcs_length;

        return diff1+diff2;
    }

    public static void main(String[] args) {
        String word1="sea";
        String word2="eat";
        System.out.println(minOperations(word1,word2));
    }
}