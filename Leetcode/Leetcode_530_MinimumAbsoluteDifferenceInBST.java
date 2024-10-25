import javax.swing.tree.TreeNode;

public class Leetcode_530_MinimumAbsoluteDifferenceInBST {
    private TreeNode firstNum;
    private TreeNode secondNum;
    private int ans = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        dfsFirst(root,root);
        return ans;
    }

    private void dfsFirst(TreeNode root, TreeNode orgRoot){
        if(root == null) return;

        dfsFirst(root.left, root);

        firstNum = root;
        dfsSecond(firstNum,orgRoot);
        
        dfsFirst(root.right, root);
    }

    private void dfsSecond(TreeNode firstNum, TreeNode orgRoot){
        if(orgRoot == null) return;

        dfsSecond(firstNum, orgRoot.left);

        if(orgRoot == firstNum) secondNum = new TreeNode(200001);
        else{
            secondNum = orgRoot;
        }
        ans = Math.min(ans,Math.abs(firstNum.val - secondNum.val));

        dfsSecond(firstNum, orgRoot.right);
    }
}
