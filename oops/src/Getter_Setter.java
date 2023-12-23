import java.util.*;
//getter and setter are function of a class
public class Getter_Setter {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.getRoll());//this is a getter as it gets the private property from the student class and we can access it outside the class through this function

        s1.setRoll(75);//this is a setter that sets a value of private property
        System.out.println(s1.getRoll());

        s1.setPincode(400075);
        System.out.println(s1.getPincode());

    }
}
