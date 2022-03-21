package Program;

public class SearchInsert {

    public static void main(String[] args){

    }

    public static int searchInsert(int[] nums, int target){
        int index = 0;
        while (index < nums.length){
            if(target < nums[index]){
                break;
            }
            index++;
        }
        return index;
    }
}
