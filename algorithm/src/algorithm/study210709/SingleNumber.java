package algorithm.study210709;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
	    List<Integer> list = new ArrayList<>();
	    for (int i : nums) {
	      if (!list.contains(i)) {
	        list.add(i);
	      } else {
	        list.remove(new Integer(i));
	      }
	    }
	    return list.get(0);
	  }
	
    public static void main(String[] args) {
    	SingleNumber sn = new SingleNumber();
    	int result = sn.singleNumber(new int[] {2,4,2,4,1});
       System.out.println((result));
    }
}
