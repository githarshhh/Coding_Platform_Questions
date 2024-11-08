import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode_971_FlipBinaryTreeToMatchPreorderTraversal {
    ArrayList<Integer> res;
    int[] v;
    int i;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        res = new ArrayList<>();
        v = voyage;
        i = 0;

        return dfs(root) ? res : Arrays.asList(-1);
    }

    private boolean dfs(TreeNode root){
        if(root == null) return true;
        if(root.val != v[i++]) return false;

        if(root.left != null && root.left.val != v[i]){
            res.add(root.val);
            return dfs(root.right) && dfs(root.left);
        }else{
            return dfs(root.left) && dfs(root.right);
        }
    }
}
