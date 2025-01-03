import javax.swing.tree.TreeNode;

public class Leetcode_543_DiameterOfBinaryTree {
    private int result = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        solve(root);
        return result;
    }

    private int solve(TreeNode root){
        if(root == null) return 0;

        int left = solve(root.left);
        int right = solve(root.right);

        result = Math.max(result, left + right);
        return Math.max(left, right) + 1;
    }
}

