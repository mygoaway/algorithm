package algorithm.study210723;

import java.util.Stack;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minSize = 100;
        int idx = -1;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < minSize){
            	minSize = strs[i].length();
                idx = i;
            }
        }
        String s = strs[idx];
        
        for(int j = 0; j < minSize; j++){
            for(int k = 0; k < strs.length; k++){
                if(s.charAt(j) != strs[k].charAt(j)){
                    return s.substring(0,j);
                }
            }
        }
        return s;
    }

	
    public static void main(String[] args) {
    	LongestCommonPrefix lcp = new LongestCommonPrefix();
    	String result = lcp.longestCommonPrefix(new String [] {"jay", "japt", "japa!!"});
        System.out.println((result));
    }
}
