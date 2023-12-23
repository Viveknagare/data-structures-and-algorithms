import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],i);
        }

        int[]newarr=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]==target && map.containsKey(0)){
                newarr[0]=i;
                newarr[1]=0;
                break;
            } else if(map.containsKey(target-arr[i])) {
                if(map.get(target-arr[i])>i) {
                    newarr[0] = i;
                    newarr[1] = map.get(target - arr[i]);
                    break;
                }
            }
        }

        System.out.println("index are "+newarr[0]+" and "+newarr[1]);


    }
}
