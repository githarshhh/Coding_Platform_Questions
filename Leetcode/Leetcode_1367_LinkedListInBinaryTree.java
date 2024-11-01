import javax.swing.tree.TreeNode;

public class Leetcode_1367_LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;

        return check(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean check(ListNode head, TreeNode root){
        if(head == null) return true;
        if(root == null) return false;

        if(head.val != root.val) return false;
        return check(head.next, root.left) || check(head.next, root.right);
    }
}
