public class Leetcode_2095_DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        while(fast != null && fast.next != null){
            temp = temp.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = temp.next.next;
        return dummy.next;
    }
}
