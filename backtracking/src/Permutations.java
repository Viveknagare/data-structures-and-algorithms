import java.util.*;

public class Permutations {
    public static void backtrack(List<List<Character>> result,List<Character> temp,char[]nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i]))continue;

            temp.add(nums[i]);
            backtrack(result,temp,nums);
            temp.remove(temp.size()-1);

        }
    }
    public static List<List<Character>> permute(char[] nums) {
        List<List<Character>> result=new ArrayList<>();
        List<Character> temp=new ArrayList<>();
        backtrack(result,temp,nums);
        return result;


    }

    public static void main(String[] args) {
        char []arr ={'A','B','C'};
        List<List<Character>> result=permute(arr);
        System.out.println(result);
    }
}