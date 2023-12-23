import java.util.*;
public class Classes {
    //apna khudka data type banaya Student naam ka
    //agar ye nahi banate toh 3 alag array banana padta 3 properties ke liye
    //yeh aisa data type hein jo 3 cheeze store karta hein
    //yaha ham student class ka dabba matlab student class ka he array bana denge jisme ham 3 cheeze store karenge
    public static class Student{
        int roll;
        double percent;
        String name;
    }

    public static void demo(Student s1){
        System.out.println(s1.name);
    }



    public static void main(String[] args) {

         class Car{
            int price;
            String name;
            int wheels;
        }

        Student s1=new Student();//memory ke andar kuch x naam ka dabba baanaya
        s1.name="vivek";
        s1.percent=80.60;
        s1.roll=20;
        System.out.println(s1.name);
        System.out.println(s1.percent);
        System.out.println(s1.roll);


        //classname dabba(object)=new classname();
        Student s2=new Student();
        s2.name="kiddo";
        s2.percent=96.5;
        s2.roll=35;
        System.out.println("//////");

        //yaha hamne student class ke 2 objects banaye s1 and s2
        //array vs class:- array is to store similar data types and class are used to store multiple properties of different datatypes

        Car c1=new Car();
        c1.name="audi";
        c1.price=100000;
        c1.wheels=4;
        System.out.println("//////");

        System.out.println(c1.name);

        //ham class ko main function ke andar bhi bana sakte hein lekin uska scope main function ke andar he hoga ham use main ke bahar access nahi kar sakte
        //for eg we will call a function outside the main which takes parameter of Student class so this function calling outside the main function can be done only if the Student class is present in outside the main function
        System.out.println("//////");
        demo(s1);

        //passing class to functions
        //step1-we have to declare the class outsdie the function

    }

}
