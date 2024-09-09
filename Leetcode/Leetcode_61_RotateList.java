public class Leetcode_61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0){
            return head;
        }

        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        k = k % len;
        if(k == 0){
            return head;
        }

        temp.next = head;

        ListNode newLast = findLast(head,len-k-1);
        head = newLast.next;
        newLast.next = null;
        return head;
    }

    public ListNode findLast(ListNode head, int k){
        ListNode temp = head;
        while(k != 0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
}
