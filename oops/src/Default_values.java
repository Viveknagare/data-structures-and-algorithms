import java.util.*;

public class Default_values {
    public static class Student{
        int roll;
        String name;

    }
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.roll);//this print the default value as 0
        System.out.println(s1.name);//this print the default value as null
    }
}
