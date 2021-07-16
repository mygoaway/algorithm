package algorithm.study210716;

public class Ispalindrome {
	
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int start = 0;
        int end = number.length() - 1;
        
        while(start < end) {
            if(number.charAt(start++) != number.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
    	Ispalindrome sn = new Ispalindrome();
    	boolean result = sn.isPalindrome(1234321);
       System.out.println((result));
    }
}
