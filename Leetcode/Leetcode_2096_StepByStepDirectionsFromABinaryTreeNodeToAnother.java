import javax.swing.tree.TreeNode;

public class Leetcode_2096_StepByStepDirectionsFromABinaryTreeNodeToAnother {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        StringBuilder rootToSrc = new StringBuilder();
        StringBuilder rootToDst = new StringBuilder();

        find(root, startValue, rootToSrc);
        find(root, destValue, rootToDst);

        int i=0;
        while(i<rootToSrc.length() && i<rootToDst.length() && rootToSrc.charAt(i) == rootToDst.charAt(i)){
            i++;
        }

        StringBuilder res = new StringBuilder();
        for(int j=0; j<rootToSrc.length()-i; j++){
            res.append('U');
        }

        for(int j=i; j<rootToDst.length(); j++){
            res.append(rootToDst.charAt(j));
        }

        return res.toString();
    }

    private boolean find(TreeNode root, int val, StringBuilder str){
        if(root == null) return false;

        if(root.val == val) return true;

        str.append('L');
        if(find(root.left, val, str)){
            return true;
        }
        str.deleteCharAt(str.length() - 1);

        str.append('R');
        if(find(root.right, val, str)){
            return true;
        }
        str.deleteCharAt(str.length() - 1);

        return false;
    }
}
