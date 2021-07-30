package algorithm.study210730;

public class lengthOfLastWord {
    public int longestCommonPrefix(String s) {
        String [] strArray = s.split(" ");
        if(strArray.length == 0) {
        	return 0;
        }
        return strArray[strArray.length -1].length();
    }

	
    public static void main(String[] args) {
    	lengthOfLastWord lcp = new lengthOfLastWord();
    	int result = lcp.longestCommonPrefix("study study");
        System.out.println((result));
    }
}
