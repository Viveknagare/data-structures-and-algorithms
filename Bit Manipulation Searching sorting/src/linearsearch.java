import java.util.*;
public class linearsearch {

    public  void linearsearch1(int []arr,int x){
        int index=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if (arr[i] == x){
                index = i;
                break;
            }
        }

        if( index==-1){
            System.out.println("element not found in the array");
        }else{
            System.out.println("element found at index "+index);
        }

    }
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //linear search
        System.out.println("enter the element you want to search in array");
        int x=sc.nextInt();

        linearsearch l1=new linearsearch();

        l1.linearsearch1(arr,x);



    }
}

//time complexity-o(n)
//space complexity-o(1)
