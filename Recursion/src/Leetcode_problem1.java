//given a 3 cross 3 grid man standing at 1st position 0,0 has to reach last position 2
public class Leetcode_problem1 {
    public static void printgridpath(int hcount,int vcount,String path ){
        if(hcount==vcount && hcount==2){
            System.out.println(path);
            return;
        }
        if(hcount>2 || vcount>2){
            return;
        }
        printgridpath(hcount+1,vcount,path+"H");
        printgridpath(hcount,vcount+1,path+"V");
    }

    public static void main(String[] args) {
        printgridpath(0,0,"");

    }
}
