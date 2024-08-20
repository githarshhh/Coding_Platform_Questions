import javax.swing.tree.TreeNode;

public class Leetcode_236_LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;

        TreeNode leftN = lowestCommonAncestor(root.left, p, q);
        TreeNode rightN = lowestCommonAncestor(root.right, p, q);

        if(leftN == null) return rightN;
        if(rightN == null) return leftN;

        return root;
    }
}
