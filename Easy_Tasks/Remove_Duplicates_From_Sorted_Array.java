package Easy_Tasks;

import java.util.HashSet;

// Task 26
public class Remove_Duplicates_From_Sorted_Array
{
    // I am satisfied with this solution since it would be better than doing the whole slicing thing.
    public int removeDuplicates(int[] nums)
    {
        if(nums == null || nums.length == 0) return 0;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }

        return hashSet.size();
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4};
        System.out.println(new Remove_Duplicates_From_Sorted_Array().removeDuplicates(nums));
    }
}