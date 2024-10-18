import javax.swing.tree.TreeNode;

public class Leetcode_101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSameTree(root.left, root.right);
    }

    private boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null || p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}
