import java.util.*;
public class STatic_keyworf {

    String name="vivek";
    int roll=39;
    static int noofstudents; //yeh dabba already ban gaya abhi bina object banaye app is property ko access kr sakte ho Student.noofstudents

    public STatic_keyworf(){
        noofstudents++;
    }

    public static void main(String[] args) {
        STatic_keyworf k1=new STatic_keyworf();
        System.out.println(k1.noofstudents);
        STatic_keyworf k2=new STatic_keyworf();
        System.out.println(k1.noofstudents);
        STatic_keyworf k3=new STatic_keyworf();
        System.out.println(k1.noofstudents);


        System.out.println();


        //or if we first write the object and then print it
        STatic_keyworf k4=new STatic_keyworf();
        STatic_keyworf k5=new STatic_keyworf();
        STatic_keyworf k6=new STatic_keyworf();
        System.out.println(k1.noofstudents);
        System.out.println(k2.noofstudents);
        System.out.println(k6.noofstudents);

    }
}
