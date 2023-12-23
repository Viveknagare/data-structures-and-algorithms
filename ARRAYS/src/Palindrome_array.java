import java.util.*;

import static java.lang.Math.ceil;

public class Palindrome_array {
    public static void main(String[] args) {
        int n=5;
        int flag=0;
        int[]arr={1,2,3,2,1};
        for(int i=0;i<=n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                flag+=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("it is not a palindrome");
        }else
            System.out.println("it is a palindrome");
    }
}
//space complexity is o(1)
//time complexity is o(n)
