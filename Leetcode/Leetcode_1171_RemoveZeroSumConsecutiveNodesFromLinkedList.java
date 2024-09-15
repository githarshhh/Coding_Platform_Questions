import java.util.HashMap;
import java.util.Map;

public class Leetcode_1171_RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        ListNode dummy = new ListNode(0);
        Map<Integer,ListNode> map = new HashMap<>();
        map.put(0,dummy);
        dummy.next = head;

        while(head != null){
            prefixSum += head.val;

            if(map.containsKey(prefixSum)){
                ListNode start = map.get(prefixSum);
                ListNode p = start;
                int pSum = prefixSum;

                while(p != head){
                    p = p.next;
                    pSum += p.val;
                    if(p != head){
                        map.remove(pSum);
                    }
                }

                start.next = head.next;
            }else {
                map.put(prefixSum, head);
            }

            head = head.next;
        }

        return dummy.next;
    }
}
