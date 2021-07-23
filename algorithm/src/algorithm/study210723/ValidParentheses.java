package algorithm.study210723;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean validParentheses(String str) {
		
		int length = str.length();
		Stack <Character> st = new Stack<>();
		
		for(int i = 0; i < length; i++) {
			char d = str.charAt(i);
			
			if(st.empty()) {
				st.push(d); 
			} else if (st.peek() == '(' && d == ')') {
				st.pop();
			} else if(st.peek() == '[' && d == ']') {
				st.pop();
			} else if(st.peek() == '{' && d == '}') {
				st.pop();
			} else {
				st.push(d);	
			}
		}
		return st.empty();
    }
	
    public static void main(String[] args) {
    	ValidParentheses vp = new ValidParentheses();
    	boolean result = vp.validParentheses("({[]{}");
       System.out.println((result));
    }
}
