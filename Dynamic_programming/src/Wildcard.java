public class Wildcard {
    public static boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        boolean [][]dp=new boolean[m+1][n+1];
        //jab pattern " " and string " " hota hein
        dp[0][0]=true;
        //jab pattern " " hoga
        for(int i=1;i<dp.length;i++){
            dp[i][0]=false;
        }
        //jab string " " hogi
        for(int j=1;j<dp[0].length;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
            //else if likhne ke jarurat nahi kyuki java baki sabko false declare krta hein
            //else if string is empty and there is ? or any character then it is false
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j]=false;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s="baaabab";
        String p="*****ba*****ab";
        System.out.println(isMatch(s,p));
    }
}