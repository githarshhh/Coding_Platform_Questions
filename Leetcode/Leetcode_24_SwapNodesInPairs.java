public class Leetcode_24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pointer = dummy;

        while(pointer.next != null && pointer.next.next != null){
            ListNode swap1 = pointer.next;
            ListNode swap2 = pointer.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;

            pointer.next = swap2;
            pointer = swap1;
        }

        return dummy.next;
    }
}
