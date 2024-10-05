import java.util.Stack;

public class Leetcode_921_MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!stk.isEmpty() && ((stk.peek().equals('(') && ch == ')'))){
                stk.pop();
                continue;
            }

            stk.push(ch);
        }

        return stk.size();
    }
}
