import java.util.Stack;

public class Leetcode_20_ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;

        Stack stk = new Stack();

        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            if(currChar == '(' || currChar == '{' || currChar == '['){
                stk.push(currChar);
            }else{
                if(stk.empty()){
                    return false;
                }
            
                char topChar = (char)stk.peek();
                if((currChar == ')' && topChar != '(') || (currChar == '}' && topChar != '{') ||
                    (currChar == ']' && topChar != '[')) {
                        return false;
                    }

                stk.pop();
                
            }

        }

        if(stk.empty()){
            return true;
        }
        return false;
    }
}
