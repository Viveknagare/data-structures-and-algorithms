import java.util.*;
public class Valid_parenthesis {

    public static boolean validparenthesis(char[]arr){
        Stack<Character>stack1=new Stack<>();
        for(char e:arr){
            if(e=='(')stack1.push(e);
            else if(e=='[')stack1.push(e);
            else if(e=='{')stack1.push(e);
            else if(stack1.isEmpty())return false;

            if(e==')'&& stack1.pop()!='(')return false;
            if(e==']'&& stack1.pop()!='[')return false;
            if(e=='}'&& stack1.pop()!='{')return false;

        }
        return stack1.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char[]arr=s.toCharArray();

        boolean ans=validparenthesis(arr);
        System.out.println("is given parenthesis true or false "+ans);
    }

}
