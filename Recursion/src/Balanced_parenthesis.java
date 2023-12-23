//if n=2 then print balanced parenthesis , eg ()(),(())
//toh yaha pe ek position pe ya toh ( ya ) bracket ayega matlab 2 choices
//if you have fixed number of choices. toh utne hein recursive call lagege jitne no of choices hein
//if you have 2 choices then 2 recursive calls lagege.
//no of recursive calls=no of fixed choices
public class Balanced_parenthesis {
    public static void printbal(int n,int cc,int oc,String ans){
        if(oc==n && cc==n){
            System.out.println(ans);
            return;
        }

        if(oc<n){
            printbal(n,cc,oc+1,ans+"(");
        }
        if(oc>cc){
            printbal(n,cc+1,oc,ans+")");
        }

    }

    public static void main(String[] args) {
        printbal(2,0,0,"");

    }

}
