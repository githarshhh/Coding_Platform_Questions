import java.util.ArrayList;
import java.util.Stack;

public class IterativeInorderTraversal {
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<Node> stk = new Stack<Node>();
        
        Node curr = root;
        
        while(true){
            if(curr != null){
                stk.push(curr);
                curr = curr.left;
            }
            else{
                if(stk.isEmpty()){
                    break;
                }
                curr = stk.pop();
                arr.add(curr.data);
                curr = curr.right;
            }
            
        }
        
        return arr;
    }
}
