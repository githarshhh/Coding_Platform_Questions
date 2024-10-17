import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode_145_BinaryTreePostorderTraversal {
    public List<Integer> ll = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return ll;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ll.add(root.val);
        
        return ll;
    }
}
