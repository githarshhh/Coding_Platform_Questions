import java.util.Stack;

public class Leetcode_232_ImplementQueueUsingStacks {
    public Stack<Integer> input;
    public Stack<Integer> output;

    public Leetcode_232_ImplementQueueUsingStacks() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        peek();
        return output.pop();
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.isEmpty() && output.isEmpty()){
            return true;
        }
        return false;
    }
}
