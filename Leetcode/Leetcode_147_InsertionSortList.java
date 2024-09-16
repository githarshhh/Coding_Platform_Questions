public class Leetcode_147_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ListNode curr = head;

        while(curr != null){
            pq.add(curr.val);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            curr.val = pq.poll();
            curr = curr.next;
        }

        return head;
    }
}
