import javax.swing.tree.TreeNode;

public class Leetcode_1339_MaximumProductOfSplittedBinaryTree {
    long maxP = 0;
    long totalSum;

    public int maxProduct(TreeNode root) {
        totalSum = calculateSum(root);
        dfs(root);
        return (int) (maxP % 1000000007);
    }

    private long calculateSum(TreeNode root){
        if(root == null) return 0;

        root.val += calculateSum(root.left) + calculateSum(root.right);
        return root.val;
    }

    private void dfs(TreeNode root){
        if(root == null) return;

        dfs(root.left);
        
        long currSum = root.val;
        long restSum = totalSum - currSum;
        maxP = Math.max(maxP, currSum * restSum);

        dfs(root.right);
        return;
    }
}
