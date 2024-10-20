import javax.swing.tree.TreeNode;

public class Leetcode_110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if(helper(root) == -1) return false;
        else return true;
    }

    private int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        if(left == -1) return -1;

        int right = helper(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }
}
