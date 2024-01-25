import java.util.*;

public class Fractional_knapsack {

    public static double getMax(ItemValue[]arr,int capacity){
        //firstly we will sort the array using profit by weight ratio using comparator
        Arrays.sort(arr,new Comparator<ItemValue>()
        {
            @Override
            public int compare(ItemValue item1, ItemValue item2) {
                double pwr1=Double.valueOf(item1.profit/item1.weight);
                double pwr2=Double.valueOf(item2.profit/ item2.weight);

                if(pwr1<pwr2)return 1;
                else return -1;
            }
        });

        double totalvalue=0;

        for(ItemValue i:arr){
            int currwt=(int)i.weight;
            int curprofit=(int)i.profit;

            if(capacity-currwt>=0){
                capacity-=currwt;
                totalvalue+=curprofit;
            }else{
                double fraction=(double)capacity/(double)currwt;
                totalvalue+=(fraction*curprofit);

                capacity=(int)(capacity-(fraction*currwt));
                break;
            }
        }

        return totalvalue;
    }

    static class ItemValue{
        int profit;
        int weight;
        ItemValue(int profit,int weight){
            this.profit=profit;
            this.weight=weight;
        }
    }


    public static void main(String[] args) {
        ItemValue[]arr={new ItemValue(25,5),
                new ItemValue(75,10),
                new ItemValue(100,12),
                new ItemValue(50,4),
                new ItemValue(45,7),
                new ItemValue(90,9),
                new ItemValue(30,3),
        };

        int capacity=37;

        double max=getMax(arr,capacity);

        System.out.println("maximum profit is "+max);
    }
}
