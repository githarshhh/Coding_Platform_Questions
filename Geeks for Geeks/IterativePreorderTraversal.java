import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorderTraversal {
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<Node> stk = new Stack<Node>();

        stk.push(root);
        
        while(!stk.isEmpty()){
            Node temp = stk.peek();
            arr.add(temp.data);
            stk.pop();
            if(temp.right != null){
                stk.push(temp.right);
            }
            if(temp.left  != null){
                stk.push(temp.left);
            }
        }
        
        return arr;
    }
}
