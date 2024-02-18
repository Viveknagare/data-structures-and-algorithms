public class Mountain_ranges {

    //this sum follow catalans format
    public static int no_of_mountains(int n){
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){ //i is number of pairs current iterating loop is executing for two pairs /\/\ .
            for(int j=0;i<i;j++){
                int leftranges=dp[j];
                int rightranges=dp[i-j-1];
                dp[i]=leftranges*rightranges;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;//no  of pairs /\/\/\/\
        System.out.println(no_of_mountains(n));
    }
}
