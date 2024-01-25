import java.util.*;
public class Min_Swaps {
    public static long swaps(String str){
        char[]arr=str.toCharArray();
        int right=0,left=0,imbalance=0,swaps=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='['){
                left++;
                if(imbalance>0){
                    swaps+=imbalance;
                    imbalance--;
                }
            }else if(arr[i]==']'){
                right++;
                imbalance=right-left;
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        String str="[]][][";
        System.out.println("minimum swaps required is "+swaps(str));
    }
}
