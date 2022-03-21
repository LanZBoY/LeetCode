package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args){
        int[] temp = {1,1,2};
        int answer = removeDuplicate(temp);
    }

    public static int removeDuplicate(int[] nums){
        HashSet<Integer> sets = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!sets.contains(nums[i])){
                sets.add(nums[i]);
            }else{
                nums[i] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return sets.size();
    }
}
