public class Leetcode_1721_SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstPtr = head;
        ListNode firstVal = null;
        ListNode secondPtr = null;

        while(firstPtr != null){
            if(k == 1){
                firstVal = firstPtr;
                secondPtr = head;
            }
            if(k < 1){
                secondPtr = secondPtr.next;
            }

            firstPtr = firstPtr.next;
            k--;
        }

        int temp = firstVal.val;
        firstVal.val = secondPtr.val;
        secondPtr.val = temp;

        return head;
    }
}
