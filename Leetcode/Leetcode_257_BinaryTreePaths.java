public class Leetcode_257_BinaryTreePaths {
    public List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root != null){
            helper(root, new StringBuilder());
        }
        return ans;
    }

    private void helper(TreeNode root, StringBuilder str){
        if(str.length() != 0){
            str.append("->");
        }
        str.append(root.val);

        if(root.left == null && root.right == null){
            ans.add(str.toString());
            return;
        }
        
        if(root.left != null){
            helper(root.left, new StringBuilder(str));
        }
        if(root.right != null){
            helper(root.right, new StringBuilder(str));
        }
    }
}
