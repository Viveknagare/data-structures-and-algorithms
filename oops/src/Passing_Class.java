import java.util.*;

//passing class to functions
//step1-we have to declare the class outsdie the function(this is because the if we make class in main function then the normal function outside the main function will not be able to access the class insdie the main function
public class Passing_Class {



    public static void change(Student s){
        s.name="kiddo";
        return;
    }

    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="vivek";
        System.out.println(s1.name);
        //updating the value

        change(s1);
        System.out.println(s1.name);//this says that the classes i.e user defined datatype are pass by refrence that is it changes the original value. same as in array,remember user defined datatypes like class,array are always pass by refrence
        //ham yeh student class dusre .java file mein shift kr sakte hein aur code run bhi hoega
        //aur agar hame student class dusre package mein hein aur woh yaha access krna hein toh hame woh package import karna padega

    }
}
