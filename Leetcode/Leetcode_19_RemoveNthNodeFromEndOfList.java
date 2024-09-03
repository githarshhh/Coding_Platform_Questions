public class Leetcode_19_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode leftPtr = dummy;
        ListNode rightPtr = dummy;

        for(int i=0; i<n; i++){
            rightPtr = rightPtr.next;
        }

        while(rightPtr.next != null){
            leftPtr = leftPtr.next;
            rightPtr = rightPtr.next;
        }

        leftPtr.next = leftPtr.next.next;

        return dummy.next;
    }
}
