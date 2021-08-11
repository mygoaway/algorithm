package algorithm.study210730;

public class MajorityElement {
    public int majorityElement(int [] nums) {
    	int majority =nums[0];
    	int counter = 1;
    	for(int i=1;i<nums.length;i++){
	    	if(majority == nums[i]){
	    		counter ++;
	    		
	   
	    	} else {
	    		counter --;
	    		if(counter == 0){
	    			majority = nums[i];
	    			counter = 1;
	    		}
	    	}
    	}
    	
    	return majority;
    }

	
    public static void main(String[] args) {
    	MajorityElement lcp = new MajorityElement();
    	int result = lcp.majorityElement(new int [] {3,2,3,2,3,3});
        System.out.println((result));
    }
}
