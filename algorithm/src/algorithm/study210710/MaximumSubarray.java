package algorithm.study210710;

public class MaximumSubarray {
	
	public int maximumSubarray(int[] nums) {
		
		int maxSumPair = nums[0];
        int max = nums[0];
        for(int idx =1;idx <nums.length;idx++){
            maxSumPair = Math.max(nums[idx]+maxSumPair,nums[idx]);
            max = Math.max(max,maxSumPair);
        }
        
        return max;
    }
	
    public static void main(String[] args) {
    	MaximumSubarray sn = new MaximumSubarray();
    	int result = sn.maximumSubarray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
       System.out.println((result));
    }
}
