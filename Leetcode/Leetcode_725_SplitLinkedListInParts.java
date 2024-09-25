public class Leetcode_725_SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int length = findLength(head);
        int remainder = length % k;
        int partSize = length / k;
        int ogPartSize = partSize;
        ListNode curr = head;

        for(int i=0; i<k; i++){
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            if(remainder > 0){
                partSize += 1;
                remainder--;
            }

            for(int j=0; j<partSize; j++){
                if(curr != null){
                    temp.next = new ListNode(curr.val);
                    temp = temp.next;
                    curr = curr.next;
                }
            }
            partSize = ogPartSize;
            ans[i] = dummy.next;
        }

        return ans;
    }

    public int findLength(ListNode head){
        int k = 0;
        while(head != null){
            k++;
            head = head.next;
        }
        return k;
    }
}
