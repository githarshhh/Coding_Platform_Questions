import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode_94_BinaryTreeInorderTraversal {
    public List<Integer> ll = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ll;

        inorderTraversal(root.left);
        ll.add(root.val);
        inorderTraversal(root.right);
        return ll;
    }
}
