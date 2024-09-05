public class Leetcode_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode prev = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int op1 = 0;
            int op2 = 0;
            if (l1 != null) {
                op1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                op2 = l2.val;
                l2 = l2.next;
            }
            int sum = op1 + op2 + carry;
            carry = sum / 10;
            ListNode result = new ListNode(sum - carry * 10); 
            prev.next = result;
            prev = result;
        }
        return head.next;
    }
}
