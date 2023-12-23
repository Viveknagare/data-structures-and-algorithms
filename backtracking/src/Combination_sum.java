import java.util.*;
public class Combination_sum {
public static void backtrack(List<List<Integer>> result, List<Integer> temp,int[]candidates,int target,int start){
        if(target<0)return;

        if(target==0)result.add(new ArrayList<>(temp));

        for(int i=start;i<candidates.length;i++){
        temp.add(candidates[i]);
        backtrack(result,temp,candidates,target-candidates[i],i);
        temp.remove(temp.size()-1);
        }
   }
public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(result,temp,candidates,target,0);
        return result;
        }

    public static void main(String[] args) {
        int[]arr={2,3,6,7};
        List<List<Integer>> res= combinationSum(arr,7);
        System.out.println(res);

    }
}