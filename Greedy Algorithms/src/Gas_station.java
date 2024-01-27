import java.util.*;

public class Gas_station {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
        }

        for(int i=0;i<cost.length;i++){
            totalcost+=cost[i];
        }

        if(totalgas<totalcost){
            return -1;
        }
        int start=0;
        int currentfuel=0;
        for(int i=0;i<gas.length;i++){
            currentfuel+=gas[i]-cost[i];
            if(currentfuel<0){
                start=i+1;
                currentfuel=0;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[]gas={1,2,3,4,5};
        int[]cost={3,4,5,1,2};
        System.out.println("the index at which we can start the car and travel entire gas stations is "+canCompleteCircuit(gas,cost));
    }
}