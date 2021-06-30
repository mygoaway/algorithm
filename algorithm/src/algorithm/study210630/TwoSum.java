package algorithm.study210630;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        
        for(int i = 0; i < size; i ++){
            for(int j = i+1; j < size; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                } 
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
    	TwoSum ts = new TwoSum();
    	int [] result = ts.twoSum(new int[] {2,7,11,15}, 9);
       System.out.println(Arrays.toString(result));
    }
}
