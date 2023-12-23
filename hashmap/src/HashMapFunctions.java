import java.util.*;
public class HashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> h1=new HashMap<>();
        //inserting values in hashmap
        h1.put(1,"vivek");
        h1.put(2,"nikunj");
        h1.put(3,"jitendra");
        System.out.println(h1);

        //getting value from the hashmap
        System.out.println(h1.get(1)); //if we try to access value at 0 we will get null

        //functionality of contains
        System.out.println(h1.containsKey(1));//it will print value if key is not present else true

        //to remove a value from hashmap. both key and value are removed
        h1.remove(1);
        System.out.println(h1);

        //iterate through a hashmap

        for(Map.Entry<Integer,String> student:h1.entrySet() ){
            Integer no=student.getKey();
            String name=student.getValue();
            System.out.println("no is "+no+" name is "+name);
        }

    }
}
