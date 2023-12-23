import java.util.*;
public class Access_modifiers {

    private int rollno;
//    public -all packages
//    private -same class
//    default-same package
    public static void main(String[] args) {
        Student s1=new Student();

        System.out.println(s1.name);
        //here we will not be able to access roll from student class as it is private
        Access_modifiers a=new Access_modifiers();
        System.out.println(a.rollno);//but we can access the roll no from Access_modifier class as we are accessing it in same class



    }
}
