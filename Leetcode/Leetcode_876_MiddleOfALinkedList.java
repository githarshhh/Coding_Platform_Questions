import java.util.LinkedList;

public class Leetcode_826_MiddleOfALinkedList {
    public Listnode middleNode(ListNode head){
        ListNode slow, fast;

        slow = head;
        fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
