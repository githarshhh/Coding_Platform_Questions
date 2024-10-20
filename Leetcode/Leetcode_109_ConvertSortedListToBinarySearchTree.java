import javax.swing.tree.TreeNode;

public class Leetcode_109_ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);

        ListNode slow_prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow_prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode mid = slow;
        TreeNode root = new TreeNode(mid.val);

        slow_prev.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }
}
