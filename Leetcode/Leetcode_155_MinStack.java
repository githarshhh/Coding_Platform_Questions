import java.util.Stack;

public class Leetcode_155_MinStack {
    Stack<Integer> stk;
    Stack<Integer> min;
    public Leetcode_155_MinStack() {
        stk = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(stk.peek().equals(min.peek())){
            min.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
