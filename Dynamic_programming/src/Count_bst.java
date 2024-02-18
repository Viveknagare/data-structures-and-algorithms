public class Count_bst{
    public static int numTrees(int n) {
        //in directly n=3 pe catalan number mang rahe hein

        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int leftsubtree=dp[j];
                int rightsubtree=dp[i-j-1];
                dp[i]+=leftsubtree*rightsubtree;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(numTrees(n));
    }
}