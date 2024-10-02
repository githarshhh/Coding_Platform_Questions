import java.util.Stack;

public class DeleteMidOfStack {
    public void deleteMid(Stack<Integer> s, int size) {
        helper(s,size,0);
    }
    
    private void helper(Stack<Integer> s, int size, int count){
        
        if(count == size/2){
            s.pop();
            return;
        }
        
        int ele = s.peek();
        s.pop();
        count = count + 1;
        helper(s,size,count);
        s.push(ele);
    }
}
