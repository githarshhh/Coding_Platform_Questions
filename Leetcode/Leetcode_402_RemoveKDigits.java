import java.util.Stack;

public class Leetcode_402_RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        int n = num.length();

        if(k==n) return "0";

        for(int i=0; i<n; i++){

            while(!stk.isEmpty() && stk.peek()-'0' > num.charAt(i)-'0' && k>0){
                stk.pop();
                k--;
            }

            stk.push(num.charAt(i));
        }
        
        while(k>0){
            stk.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(char c: stk){
            sb.append(c);
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return (sb.length() == 0) ? "0" : sb.toString();
    }
}
