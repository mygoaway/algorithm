package algorithm.study210716;

public class Ispalindrome2 {
	
    public boolean isPalindrome2(String s) {
    	 s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         int i = 0;
         int j = s.length() - 1;
         
         while (i < j) {
             if (s.charAt(i) != s.charAt(j)) {
                 return false;
             }
             i++;
             j--;
         }
         return true;
    }
	
    public static void main(String[] args) {
    	Ispalindrome2 sn = new Ispalindrome2();
    	boolean result = sn.isPalindrome2("axsxa");
       System.out.println("result = " + result);
    }
}
