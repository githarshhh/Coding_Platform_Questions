public class Leetcode_92_ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;
        ListNode curr = head;

        for(int i=0; i<left-1; i++){
            before = before.next;
            curr = curr.next;
        }
        ListNode subList = curr;

        ListNode prev = null;
        for(int i=0; i<=right-left; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        before.next = prev;
        subList.next = curr;

        return dummy.next;
    }
}
