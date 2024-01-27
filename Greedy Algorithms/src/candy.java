import java.util.*;

public class candy {
    public static int candycount(int[] ratings) {
        int dp[]=new int[ratings.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=1;
        }

        if(ratings.length==1){
            return 1;
        }

        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1] && dp[i]<=dp[i-1]){
                dp[i]=dp[i-1]+1;
            }
        }

        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && dp[i]<=dp[i+1]){
                dp[i]=dp[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<dp.length;i++){
            sum+=dp[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int []ratings={1,0,2};
        System.out.println("the sum of minimum candies is "+candycount(ratings));
    }
}