package algorithm.study210701;

public class ReverserInteger {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            int size = nums.length;
            
            for(int j = 0; j < size; j++) {
                if(nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            
            return i;
        }
    
    
    public static void main(String[] args) {
    	ReverserInteger ts = new ReverserInteger();
    	int result = ts.removeElement(new int[] {2,7,11,15}, 2);
       System.out.println(result);
    }
}
