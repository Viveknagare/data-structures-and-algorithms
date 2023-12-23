import java.util.*;
public class Student{
    private int roll; //now these cannot be accessed oustide this class
    String name;//yaha kuch likha nahi matlab iska access modifier default mein ata hein.aur yeh ham only apne package mein use kar sakte hein
  //jo default hota hein uska ham package ke bahar object bana toh lenge ,import karne ke baad lekin ham use properties nahi de sakte
    private int pincode;
    public int getRoll(){
        return roll;
    }

    public void setRoll(int x){
        roll=x;
    }

    public int getPincode(){
        return pincode;
    }

    public void setPincode(int pincode){
        this.pincode=pincode;//this.pincode depicts 
    }

}
