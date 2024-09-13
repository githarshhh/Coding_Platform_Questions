public class Leetcode_86_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);
        ListNode smallP = small;
        ListNode largeP = large;
        

        while(head != null){
            if(head.val < x){
                smallP.next = head;
                smallP = smallP.next;
            }else{
                largeP.next = head;
                largeP = largeP.next;
            }
            head = head.next;
        }

        smallP.next = large.next;
        largeP.next = null;
        return small.next;
    }
}
