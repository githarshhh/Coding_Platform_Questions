import javax.swing.tree.TreeNode;

public class Leetcode_108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        int mid = n/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, 0, mid-1);
        root.right = helper(nums, mid+1, n-1);

        return root;
    }

    private TreeNode helper(int[] nums, int l, int r){
        if(l>r) return null;

        int mid = l + (r-l)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,l,mid-1);
        root.right = helper(nums,mid+1,r);

        return root;
    }
}
