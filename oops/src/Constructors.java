public class Constructors {

    String name;
    int rollno;
    int age;

    final String school="pvb"; //now this property cannot be changed

    public Constructors(){

    }


    public Constructors(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        this.age=age;


    }

    public static void main(String[] args) {
//        Constructors c1= new Constructors("vivek",39);
//        System.out.println(c1.name);
//        System.out.println(c1.rollno);
//        c1.age=20;
//        System.out.println(c1.age);


        Constructors c2=new Constructors();
        c2.age=20;
        c2.rollno=39;
        c2.name="vivek";
        System.out.println(c2.rollno);
        System.out.println(c2.name);
        System.out.println(c2.age);

    }
}
