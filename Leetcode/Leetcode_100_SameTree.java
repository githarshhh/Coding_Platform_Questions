import javax.swing.tree.TreeNode;

public class Leetcode_100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        } 
        else if((p == null && q != null) || (p != null && q == null) || (p.val != q.val)){
            return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
