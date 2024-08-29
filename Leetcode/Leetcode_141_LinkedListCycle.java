public class Leetcode_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow = head;
        fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
