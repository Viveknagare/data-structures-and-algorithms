//question MAANG

//input=D output=21
//input=I output=12
//input=DD output=321
//input=II output=123
//input=DID output=2143
//
//
//        no repetition allowed
//        only numbers from 1-9 can be used


import java.util.*;

public class Min_num_fromGivenseq {
    public static void main(String[] args) {
        String str="DID";
        Stack<Integer>s1=new Stack<>();

        for(int i=0;i<=str.length();i++){
            s1.push(i+1);

            if(i==str.length() || str.charAt(i)=='I'){
                while(!s1.empty()) System.out.print(s1.pop());
            }
        }
    }
}
