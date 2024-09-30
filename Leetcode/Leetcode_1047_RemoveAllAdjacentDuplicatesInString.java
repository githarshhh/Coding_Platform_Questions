public class Leetcode_1047_RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!stk.isEmpty() && stk.peek() == ch){
                stk.pop();
                continue;
            }else{
                stk.push(ch);
            }
        }

        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        return sb.reverse().toString();
    }
}
