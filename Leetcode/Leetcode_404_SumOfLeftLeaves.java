import javax.swing.tree.TreeNode;

public class Leetcode_404_SumOfLeftLeaves {
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return sum;
    }

    private void helper(TreeNode root){
        if(root == null) return;
        
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }

        if(root.left != null){
            helper(root.left);
        }
        if(root.right != null){
            helper(root.right);
        }
    }
}
