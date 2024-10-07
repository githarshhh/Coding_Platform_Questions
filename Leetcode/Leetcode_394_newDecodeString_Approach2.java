import java.util.Stack;

public class Leetcode_394_newDecodeString_Approach2 {
    public String decodeString(String s) {
        Stack<Integer> numStack= new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int k=0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = (k*10) + (c-'0');
                continue;
            }

            if(c == '['){
                numStack.push(k);
                k = 0;
                stringStack.push(String.valueOf(c));
                continue;
            }

            if(c != ']'){
                stringStack.push(String.valueOf(c));
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while(!stringStack.peek().equals("[")){
                temp.insert(0,stringStack.pop());
            }

            stringStack.pop();

            StringBuilder replace = new StringBuilder();
            int count = numStack.pop();
            for(int i = 0; i<count; i++){
                replace.append(temp);
            }

            stringStack.push(replace.toString());
        }

        StringBuilder result = new StringBuilder();
        while(!stringStack.empty()){
            result.insert(0,stringStack.pop());
        }

        return result.toString();

    }
}
