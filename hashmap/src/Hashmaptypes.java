
import java.util.*;
public class Hashmaptypes {
    public static void main(String[] args) {

        //Hashmap prints the key value pair in unordered format
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(3,"vivek");
        map1.put(1,"chinmay");
        map1.put(6,"nikunj");
        map1.put(2,"Madhura");

        System.out.println(map1);

        //LinkedHashMap prints the key value pair in the format they are inserted

        LinkedHashMap<Integer,String > map2=new LinkedHashMap<>();
        map2.put(4,"nikunj");
        map2.put(2,"vivek");
        map2.put(10,"Madhura");
        map2.put(11,"Jitendra");

        System.out.println(map2);

        //TreeMap
        TreeMap <Integer,String> map3=new TreeMap<>();
        map3.put(3,"vivek");
        map3.put(1,"chinmay");
        map3.put(6,"nikunj");
        map3.put(2,"Madhura");

        System.out.println(map3);
    }
}
