import java.util.*;

public class Job_sequencing {
    char id;
    int deadline;
    int profit;

    Job_sequencing(char id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    public Job_sequencing() {

    }

    //sorting the deadlines in decending order
    public void printjobsequence(ArrayList<Job_sequencing>arr,int maxdeadline){
        int n=arr.size();
        Collections.sort(arr,(a,b)->b.profit-a.profit );       //comparator
        char[]jobs=new char[maxdeadline];
        boolean[]result=new boolean[maxdeadline];

        for(int i=0;i<n;i++) {
            for(int j=Math.min(maxdeadline-1,arr.get(i).deadline-1);j>=0;j--){
                if(result[j]==false){
                    result[j]=true;
                    jobs[j]=arr.get(i).id;
                    break;
                }
            }
        }

        for(char i:jobs){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        ArrayList<Job_sequencing> arr=new ArrayList<>();
        arr.add(new Job_sequencing('1',5,55));
        arr.add(new Job_sequencing('2',2,65));
        arr.add(new Job_sequencing('3',7,75));
        arr.add(new Job_sequencing('4',3,60));
        arr.add(new Job_sequencing('5',2,70));
        arr.add(new Job_sequencing('6',1,50));
        arr.add(new Job_sequencing('7',4,85));
        arr.add(new Job_sequencing('8',5,68));
        arr.add(new Job_sequencing('9',3,45));

        Job_sequencing s1=new Job_sequencing();
        s1.printjobsequence(arr,7);
    }
}
