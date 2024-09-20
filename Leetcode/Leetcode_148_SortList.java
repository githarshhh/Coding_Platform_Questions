public class Leetcode_148_SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = findMid(head);
        ListNode rightMid = mid.next;
        mid.next = null;
        ListNode leftMid = head;

        ListNode left = sortList(leftMid);
        ListNode right = sortList(rightMid);

        return mergeList(left,right);
    }

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode first, ListNode second){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(first != null && second != null){
            if(first.val <= second.val){
                temp.next = first;
                temp = first;
                first = first.next;
            }else{
                temp.next = second;
                temp = second;
                second = second.next;
            }
        }

        if(first != null) temp.next = first;
        else temp.next = second;
        return dummy.next;
    }
}
