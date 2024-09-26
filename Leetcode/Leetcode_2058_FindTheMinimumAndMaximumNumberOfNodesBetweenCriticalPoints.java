public class Leetcode_2058_FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;

        int minDist = Integer.MAX_VALUE;
        int prevCritical = 0;
        int firstCritical = 0;
        int[] res = {-1,-1};

        while(curr.next != null){
            if((prev.val < curr.val && curr.val > curr.next.val) || (prev.val > curr.val && curr.val < curr.next.val)){

                if(prevCritical == 0){
                    firstCritical = i;
                    prevCritical = i;
                }else{
                    minDist = Math.min(minDist, i-prevCritical);
                    prevCritical = i;
                }

            }
            i++;
            prev = curr;
            curr = curr.next;
        }

        if(minDist == Integer.MAX_VALUE) return res;
        else{
            res[0] = minDist;
            res[1] = prevCritical - firstCritical;
            return res;
        }
    }
}
