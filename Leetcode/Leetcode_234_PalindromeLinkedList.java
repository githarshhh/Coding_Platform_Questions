public class Leetcode_234_PalindromeLinkedList {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        slow = head;
        fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode rev = reverse(slow.next);
        slow.next = null;

        while(rev != null){
            if(rev.val != head.val){
                return false;
            }
            rev = rev.next;
            head = head.next;
        }

        return true;
    }
}
