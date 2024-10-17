import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode_144_BinaryTreePreorderTraversal {
    public List<Integer> ll = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return ll;

        ll.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return ll;
    }
}
