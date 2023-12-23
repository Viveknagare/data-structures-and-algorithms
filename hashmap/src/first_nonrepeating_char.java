import java.util.*;
public class first_nonrepeating_char {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap <Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int result=-1;
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1) {
                System.out.println("char found at index " + i);
                result = 1;
                break;
            }
        }

        if(result==-1){
            System.out.println("char not found");
        }





    }
}
